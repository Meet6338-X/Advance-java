import javax.swing.*;
import java.awt.*;

public class output2table extends JFrame {
    JTable jt;

    output2table() {
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(500, 500);
        String[] th = { "ID", "Name", "Salary" };
        Object[][] mt = {
                { "101", "amit", "67000" },
                { "102", "Jai", "78000" },
                { "101", "sachin", "70000" },

        };
        jt = new JTable(mt, th);
        int vscrollbar = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int hscrollbar = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane mp = new JScrollPane(jt, vscrollbar, hscrollbar);
        add(mp, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        output2table t = new output2table();
    }
}
