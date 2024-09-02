import javax.swing.*;
import java.awt.*;

public class try1Prgress extends JFrame {

    JProgressBar pb;

    try1Prgress() {
        setLayout(null);
        pb = new JProgressBar(0, 100);
        pb.setBounds(50, 50, 150, 30);
        pb.setStringPainted(true);
        add(pb);
        pb.setValue(100);
        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        try1Prgress t = new try1Prgress();
    }
}
