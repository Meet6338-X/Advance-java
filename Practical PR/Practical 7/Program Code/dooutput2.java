
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class dooutput2 extends JFrame {
    JTree tree;
    JTextField jt;

    dooutput2() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(500, 500);
        jt = new JTextField("hi");
        DefaultMutableTreeNode Top = new DefaultMutableTreeNode("India", true);
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("Gujrath");
        Top.add(A);
        Top.add(B);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Mumbai");
        A.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Pune");
        A.add(a2);
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("Nashik");
        A.add(a3);
        DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("Nagpur");
        A.add(a4);
        tree = new JTree(Top);
        Container con = getContentPane();
        con.add(tree, BorderLayout.CENTER);
        con.add(jt, BorderLayout.SOUTH);
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
        dooutput2 t = new dooutput2();
    }
}
