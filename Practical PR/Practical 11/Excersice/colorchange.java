import java.awt.*;
import java.awt.event.*;

public class colorchange extends Frame implements ActionListener {
    Button b = new Button("CHANGE COLOR");
    boolean flag = true;

    colorchange() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        b.setBounds(50, 50, 90, 20);
        b.addActionListener(this);
        add(b);
    }

    public void paint(Graphics g) {
        if (flag)
            setBackground(Color.RED);
        else
            setBackground(Color.BLUE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            flag = !flag;
            repaint();
        }
    }

    public static void main(String[] args) {
        new colorchange();
    }
}