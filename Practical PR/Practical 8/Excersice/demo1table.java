import javax.swing.*;
import java.awt.*;

public class demo1table extends JFrame {
    JTable jt;

    demo1table() {
        setLayout(new BorderLayout());
        setSize(500, 500);
        setVisible(true);
        String[] th = { "Name of Student", "Percentage", "Grade" };
        Object[][] mt = {
                { "Meet", "96", "A" },
                { "Shivam", "99", "A" },
                { "Aashutosh", "90", "B" },
                { "Shristi", "76", "B" },
                { "Vedant", "69", "C" },
                { "Khushi", "89", "B" },
                { "Sneha", "91", "A" },
                { "Neha", "90", "A" },
                { "Tanvi", "85", "B" }
        };
        jt = new JTable(mt, th);
        int vscrollbar = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int hscrollbar = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane mp = new JScrollPane(jt, vscrollbar, hscrollbar);
        add(mp, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        demo1table t = new demo1table();
    }
}
