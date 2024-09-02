
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.tree.TreePath.*;

public class demo1tree extends JFrame {
    JTree tree;
    JTextField jt;

    demo1tree() {
        setLayout(new BorderLayout());
        jt = new JTextField("hi");
        setSize(500, 500);
        setVisible(true);
        DefaultMutableTreeNode Top = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
        Top.add(A);
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
        Top.add(B);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
        A.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");
        A.add(a2);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
        B.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
        B.add(b2);
        tree = new JTree(Top);
        add(tree, BorderLayout.CENTER);
        add(jt, BorderLayout.SOUTH);
        tree.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                doMouseClicked(me);
            }

        });
    }

    void doMouseClicked(MouseEvent me) {
        TreePath tp = tree.getPathForLocation(me.getX(), me.getY());
        if (tp != null)
            jt.setText(tp.toString());
        else
            jt.setText(" ");
    }

    public static void main(String[] args) {
        demo1tree t = new demo1tree();
    }
}
