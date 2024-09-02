import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class try1keyPress extends Frame implements KeyListener {
    String msg = "";
    Label i;

    try1keyPress() {
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(1000, 1000);
        addKeyListener(this);
        requestFocus();
        i = new Label();
        add(i, BorderLayout.SOUTH);

    }

    public void keyPressed(KeyEvent ke) {
        // repaint();
        i.setText("Key Pressed");

    }

    public void keyReleased(KeyEvent ke) {
        // repaint();
        i.setText("Key Released");
    }

    public void keyTyped(KeyEvent k) {
        Font f;
        f = new Font("Monotype Corsiva", Font.BOLD, 30);
        msg += k.getKeyChar();
        setFont(f);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }

    public static void main(String[] args) {
        try1keyPress t = new try1keyPress();
    }
}