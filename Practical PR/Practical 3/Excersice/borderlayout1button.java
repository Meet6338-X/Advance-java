import java.awt.*;
import java.applet.Applet;

public class borderlayout1button extends Applet {
    public void init() {
        setLayout(new BorderLayout());
        add("North", new Button("North"));
        add("South", new Button("South"));
        add("East", new Button("East"));
        add("West", new Button("West"));
        add("Center", new Button("Center"));
    }
}
