import java.applet.Applet;
import java.awt.*;

public class okresetcancel extends Applet {
    Button b1, b2, b3;

    public void init() {
        b1 = new Button("OK");
        b2 = new Button("CANCEL");
        b3 = new Button("RESET");
        add(b1);
        add(b2);
        add(b3);
    }
}
