import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class specialkey extends Frame implements KeyListener {
    String msg = "";
    Label i;

    specialkey() {
        i = new Label();
        addKeyListener(this);
        setVisible(true);
        setSize(600, 600);
        add(i, BorderLayout.SOUTH);
    }

    public void keyReleased(KeyEvent ke) {
        i.setText("Key Released");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyCode();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 100);
    }

    public void keyPressed(KeyEvent k) {
        int key = k.getKeyCode();
        switch (key) {
            case KeyEvent.VK_F1:
                msg += "F1";
                break;
            case KeyEvent.VK_F2:
                msg += "F2";
                break;
            case KeyEvent.VK_F3:
                msg += "F3";
                break;
            case KeyEvent.VK_F4:
                msg += "F4";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "RIGHT";
                break;
            case KeyEvent.VK_LEFT:
                msg += "LEFT";
                break;
            case KeyEvent.VK_UP:
                msg += "UP";
                break;
            case KeyEvent.VK_DOWN:
                msg += "DOWN";
                break;
        }
    }

    public static void main(String[] args) {
        specialkey t = new specialkey();
    }
}