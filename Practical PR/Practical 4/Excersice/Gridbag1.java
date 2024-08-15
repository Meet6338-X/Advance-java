import java.applet.Applet;
import java.awt.*;

public class Gridbag1 extends Applet {
    public void init() {
        Button b1 = new Button("Button one");
        Button b2 = new Button("Button two");
        Button b3 = new Button("Button three");
        Button b4 = new Button("Button four");
        Button b5 = new Button("Button five");
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(b1, gc);
        gc.gridx = 1;
        gc.gridy = 0;
        add(b2, gc);
        gc.gridx = 0;
        gc.gridy = 1;
        add(b3, gc);
        gc.gridx = 1;
        gc.gridy = 1;
        add(b4, gc);
        gc.ipadx = 80;
        gc.gridwidth = 3;
        gc.gridx = 0;
        gc.gridy = 2;
        add(b5, gc);
    }
}
