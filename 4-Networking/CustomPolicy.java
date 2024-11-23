import java.security.*;
import java.security.cert.Certificate;
import java.net.URL;
import java.io.*;

public class CustomPolicy extends Policy {
    private PermissionCollection permissions;

    // Constructor
    public CustomPolicy() {
        permissions = new Permissions();
        // Add default permissions
        permissions.add(new FilePermission("<<ALL FILES>>", "read"));
        permissions.add(new RuntimePermission("createClassLoader"));
    }

    // Retrieve permissions for a given CodeSource
    @Override
    public PermissionCollection getPermissions(CodeSource cs) {
        Permissions csPermissions = new Permissions();

        // Example: Grant read access to specific files if CodeSource is a trusted
        // location
        try {
            if (cs.getLocation() != null) {
                String sourceURL = cs.getLocation().toString();
                if (sourceURL.startsWith("file:/trusted/")) {
                    csPermissions.add(new FilePermission("/trusted/*", "read"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error determining permissions for CodeSource: " + e.getMessage());
        }

        return csPermissions;
    }

    // Refresh the policy
    @Override
    public void refresh() {
        System.out.println("Refreshing policy...");
        // Reinitialize permissions, simulating a reload from configuration
        permissions = new Permissions();
        permissions.add(new FilePermission("<<ALL FILES>>", "read"));
        permissions.add(new RuntimePermission("createClassLoader"));
    }

    // Main Method to Demonstrate Policy Usage
    public static void main(String[] args) {
        // Create a new policy and set it as the system policy
        CustomPolicy customPolicy = new CustomPolicy();
        Policy.setPolicy(customPolicy);

        // Retrieve the current policy
        Policy currentPolicy = Policy.getPolicy();
        System.out.println("Current Policy: " + currentPolicy.getClass().getSimpleName());

        // Example CodeSource (normally this would be dynamically determined)
        try {
            URL url = new URL("file:/trusted/");
            CodeSource trustedCodeSource = new CodeSource(url, (Certificate[]) null);
            PermissionCollection permissions = currentPolicy.getPermissions(trustedCodeSource);

            System.out.println("\nPermissions for trusted code source:");
            permissions.elements().asIterator().forEachRemaining(System.out::println);

            // Refresh the policy
            System.out.println("\nRefreshing policy...");
            currentPolicy.refresh();

            // Re-check permissions
            permissions = currentPolicy.getPermissions(trustedCodeSource);
            System.out.println("\nPermissions after refresh:");
            permissions.elements().asIterator().forEachRemaining(System.out::println);

        } catch (Exception e) {
            System.out.println("Error creating CodeSource: " + e.getMessage());
        }
    }
}