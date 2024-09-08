import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowAdapterclass extends WindowAdapter {
    JFrame f;
    JLabel l;

    WindowAdapterclass() {
        f = new JFrame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.addWindowListener(this);
        f.addWindowFocusListener(this);
    }

    public void windowLostFocus(WindowEvent we) {
        l = new JLabel("Window Lost Focus");
        f.remove(l);
        f.add(l);
    }

    public void windowOpened(WindowEvent we) {
        l = new JLabel("Window Opened");
        f.remove(l);
        f.add(l);
    }

    public void windowActivated(WindowEvent we) {
        l = new JLabel("Window Activated");
        f.remove(l);
        f.add(l);
    }

    public void windowDeactivated(WindowEvent we) {
        l = new JLabel("Window Deactivated");
        f.remove(l);
        f.add(l);
    }

    public void windowGainedFocus(WindowEvent we) {
        l = new JLabel("Window Gained Focus");
        f.remove(l);
        f.add(l);
    }

    public static void main(String[] args) {
        WindowAdapterclass wa = new WindowAdapterclass();
    }
}
