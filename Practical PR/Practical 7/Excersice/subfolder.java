import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class subfolder extends JFrame {
    JTree tree;

    subfolder() {
        setLayout(new BorderLayout());
        setSize(500, 500);
        setVisible(true);
        DefaultMutableTreeNode Top = new DefaultMutableTreeNode("System", true);
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("C:");
        Top.add(A);
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("D:");
        Top.add(B);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Windows");
        A.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Users");
        A.add(a2);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Java");
        B.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Python");
        B.add(b2);
        tree = new JTree(Top);
        Container con = getContentPane();
        con.add(tree, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        subfolder t = new subfolder();
    }
}
