import java.awt.*;
import java.awt.event.*;

public class keyListener2 extends Frame implements KeyListener {
    String msg = "";
    Label statusLabel;

    keyListener2() {
        setSize(1800, 1000);
        setLayout(null);

        statusLabel = new Label("Press any key...");
        statusLabel.setBounds(50, 50, 300, 30);
        add(statusLabel);

        addKeyListener(this);

        setBounds(0, 0, 1800, 1000);

        setVisible(true);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        statusLabel.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent ke) {
        statusLabel.setText("Key Released");
    }

    public void keyTyped(KeyEvent k) {
        Font f = new Font("Monotype Corsiva", Font.BOLD, 30);
        msg += k.getKeyChar();
        setFont(f);
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        new keyListener2();
    }
}