import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class multiplebutton extends Frame implements ActionListener {
    String msg = "";
    TextField t1, t2, t3;
    Button b;

    multiplebutton() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600, 600);
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t3.setEditable(false);
        b = new Button("Multiply");
        add(t1);
        add(t2);
        add(t3);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (ae.getActionCommand().equals("Multiply")) {
                int result = n1 * n2;
                t3.setText(Integer.toString(result));
                msg = "Result: " + result;
            }
        } catch (NumberFormatException e) {
            msg = "Please enter valid integers.";
            t3.setText("");
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 500);
    }

    public static void main(String[] args) {
        new multiplebutton();
    }
}