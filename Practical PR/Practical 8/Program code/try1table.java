import javax.swing.*;
import java.awt.*;

public class try1table extends JFrame {
    JTable jt;

    try1table() {
        setLayout(new BorderLayout());
        setSize(500, 500);
        setVisible(true);
        String[] th = { "Name of Student", "Roll No", "Domain" };
        Object[][] mt = {
                { "Meet", "2536", "Mobile Development" },
                { "Shivam", "2531", "Management" },
                { "Aashutosh", "2511", "Desiging(UI/UX)" },
                { "Shristi", "2551", "IOT" },
                { "Vedant", "2523", "Java Developer" },
                { "Khushi", "2510", "Web Developer" },
                { "Sneha", "2509", "Software Developer" },
                { "Neha", "2533", "Dancing" },
                { "Tanvi", "2513", "Editing" }
        };
        jt = new JTable(mt, th);
        int vscrollbar = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int hscrollbar = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane mp = new JScrollPane(jt, vscrollbar, hscrollbar);
        add(mp, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try1table t = new try1table();
    }
}
