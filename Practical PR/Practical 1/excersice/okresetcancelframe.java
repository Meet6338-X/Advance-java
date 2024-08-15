import java.awt.*;

class okresetcancelframe extends Frame {
    okresetcancelframe() {
        Frame f = new Frame("BUTTON");
        // LABEL EXAMPLBUTTON
        Button b1 = new Button("OK");
        Button b2 = new Button("Reset");
        Button b3 = new Button("Cancel");
        b1.setBounds(100, 100, 50, 25);
        b2.setBounds(160, 100, 50, 25);
        b3.setBounds(220, 100, 50, 25);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        okresetcancelframe r = new okresetcancelframe();
    }
}