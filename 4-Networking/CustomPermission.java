import java.security.Permission;
import java.security.PermissionCollection;

public class CustomPermission extends Permission {
    private String actions;

    // Constructor
    public CustomPermission(String name, String actions) {
        super(name); // Call the parent Permission class constructor
        this.actions = actions;
    }

    // Abstract method implementation: equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CustomPermission))
            return false;
        CustomPermission other = (CustomPermission) obj;
        return this.getName().equals(other.getName()) && this.actions.equals(other.actions);
    }

    // Abstract method implementation: hashCode()
    @Override
    public int hashCode() {
        return getName().hashCode() + actions.hashCode();
    }

    // Abstract method implementation: getActions()
    @Override
    public String getActions() {
        return actions;
    }

    // Abstract method implementation: implies()
    @Override
    public boolean implies(Permission p) {
        if (!(p instanceof CustomPermission))
            return false;
        CustomPermission other = (CustomPermission) p;
        // Implies logic: if this actions contains all actions of other
        return this.getName().equals(other.getName()) && this.actions.contains(other.actions);
    }

    // Optional method override: newPermissionCollection()
    @Override
    public PermissionCollection newPermissionCollection() {
        return null; // Default behavior for simplicity
    }

    public static void main(String[] args) {
        // Create instances of CustomPermission
        CustomPermission readPermission = new CustomPermission("FileRead", "read");
        CustomPermission writePermission = new CustomPermission("FileWrite", "write");
        CustomPermission readWritePermission = new CustomPermission("FileReadWrite", "read,write");

        // Demonstrating constructor
        System.out.println("Created Permissions:");
        System.out.println(readPermission);
        System.out.println(writePermission);
        System.out.println(readWritePermission);

        // Demonstrating getName() and getActions()
        System.out.println("\nPermission Names and Actions:");
        System.out.println("Name: " + readPermission.getName() + ", Actions: " + readPermission.getActions());
        System.out.println("Name: " + writePermission.getName() + ", Actions: " + writePermission.getActions());

        // Demonstrating equals() and hashCode()
        System.out.println("\nEquality Check:");
        System.out.println("readPermission equals writePermission: " + readPermission.equals(writePermission));
        System.out.println("readPermission equals new readPermission: " +
                readPermission.equals(new CustomPermission("FileRead", "read")));
        System.out.println("HashCode of readPermission: " + readPermission.hashCode());

        // Demonstrating implies()
        System.out.println("\nImplied Permission Check:");
        System.out.println("readWritePermission implies readPermission: " +
                readWritePermission.implies(readPermission));
        System.out.println("readPermission implies writePermission: " +
                readPermission.implies(writePermission));

        // Demonstrating toString()
        System.out.println("\nPermission String Representation:");
        System.out.println(readPermission);
        System.out.println(readWritePermission);

        // Demonstrating checkGuard() (requires SecurityManager)
        try {
            readPermission.checkGuard(null); // No SecurityManager installed, does nothing
            System.out.println("checkGuard passed (no SecurityManager)");
        } catch (SecurityException e) {
            System.out.println("checkGuard failed: " + e.getMessage());
        }
    }

    // Override toString() for clarity
    @Override
    public String toString() {
        return "(" + this.getClass().getSimpleName() + ", " + getName() + ", " + actions + ")";
    }
}