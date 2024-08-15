import java.applet.Applet;
import java.awt.*;

public class GridLayout1button extends Applet {
    Button b;

    public void init() {
        setLayout(new GridLayout(3, 2, 15, 15));
        for (int i = 1; i <= 5; i++) {
            add(new Button("BUTTON " + Integer.toString(i)));
        }
    }
}
