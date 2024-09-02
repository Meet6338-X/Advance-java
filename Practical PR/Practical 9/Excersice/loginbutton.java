import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginbutton extends JFrame implements ActionListener {
    JProgressBar pb;
    JButton b1 = new JButton("LOGIN");

    loginbutton() {
        setLayout(null);
        setSize(800, 800);
        setVisible(true);
        pb = new JProgressBar(1, 100);
        b1.setBounds(20, 20, 80, 25);
        pb.setBounds(110, 20, 200, 25);
        pb.setValue(0);
        pb.setStringPainted(true);
        add(b1);
        add(pb);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int i = 0;
        if (e.getSource() == b1) {
            try {
                while (i <= 100) {
                    Thread.sleep(50);
                    pb.paintImmediately(0, 0, 200, 25);
                    pb.setValue(i);
                    i++;
                }
            } catch (Exception e1) {
                System.out.print("Caughted exception is =" + e1);
            }
        }
    }

    public static void main(String[] args) {
        loginbutton t = new loginbutton();
    }
}
