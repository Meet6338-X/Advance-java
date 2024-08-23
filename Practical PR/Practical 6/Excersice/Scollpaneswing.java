import java.awt.*;
import javax.swing.*;

public class Scollpaneswing extends JFrame {
    Scollpaneswing() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        JPanel mypanel = new JPanel();
        JLabel L1 = new JLabel();
        ImageIcon i = new ImageIcon("C:/Users/shahm/Pictures/Screenshots/opinto.png");
        L1.setLocation(20, 100);
        L1.setSize(120, 120);
        L1.setIcon(i);
        mypanel.add(L1);
        int vscrollbar = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int hscrollbar = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(mypanel, vscrollbar, hscrollbar);
        con.add(jsp, BorderLayout.CENTER);
        setVisible(true);
        setSize(500, 600);
    }

    public static void main(String[] args) {
        Scollpaneswing co = new Scollpaneswing();
    }
}