
import javax.swing.*;
import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JProgressBar;

public class demo1jprogressbar extends JFrame {

    JProgressBar pb;

    demo1jprogressbar() {
        pb = new JProgressBar(0, 2000);
        pb.setBounds(50, 50, 150, 30);
        pb.setValue(0);
        setVisible(true);
        setSize(800, 800);
        pb.setStringPainted(true);
        add(pb);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        int i = 0;
        try {
            while (i <= 2000) {
                pb.setValue(i);
                Thread.sleep(100);
                i = i + 20;
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        demo1jprogressbar t = new demo1jprogressbar();
    }
}
