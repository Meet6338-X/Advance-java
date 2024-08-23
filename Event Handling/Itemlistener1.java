import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Itemlistener1 extends Frame implements ItemListener {
    Checkbox c1, c2, c3;

    Itemlistener1() {
        c1 = new Checkbox("windows");
        c2 = new Checkbox("Mac");
        c3 = new Checkbox("Apple");
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setVisible(true);
        setSize(700, 700);
        setLayout(new FlowLayout());
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(c1.getLabel() + "   " + c1.getState(), 100, 300);
        g.drawString(c2.getLabel() + "   " + c2.getState(), 100, 200);
        g.drawString(c3.getLabel() + "   " + c3.getState(), 100, 400);
    }

    public static void main(String[] args) {
        new Itemlistener1();
    }
}