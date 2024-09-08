import java.awt.event.*;
import javax.swing.*;

public class demojpasswordfield extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b;
    String str = " ";
    JFrame f;

    demojpasswordfield() {
        f = new JFrame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setTitle("LOGIN FORM");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Enter Username:");
        l1.setBounds(50, 100, 120, 20);
        f.add(l1);
        l2 = new JLabel("Enter Password");
        l2.setBounds(50, 150, 120, 20);
        f.add(l2);
        t1 = new JTextField();
        t1.setBounds(200, 100, 120, 20);
        f.add(t1);
        t2 = new JPasswordField();
        t2.setEchoChar('#');
        t2.setBounds(200, 150, 120, 20);
        f.add(t2);
        b = new JButton("Submit");
        b.setBounds(150, 200, 100, 30);
        f.add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (t1.getText().equals("Meet") && (t2.getText().equals("Meet123")))
            JOptionPane.showMessageDialog(null, "Successfullly logined....");
        else
            JOptionPane.showMessageDialog(null, "Invalid user");
    }

    public static void main(String[] args) {
        new demojpasswordfield();
    }
}
