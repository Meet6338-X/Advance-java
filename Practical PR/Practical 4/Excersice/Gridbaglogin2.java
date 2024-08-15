import java.applet.Applet;
import java.awt.*;

public class Gridbaglogin2 extends Applet {
    public void init() {
        Label lName = new Label("Name");
        TextField tName = new TextField(10);
        Label lcomments = new Label("Comments");
        TextArea TAreaComments = new TextArea(6, 15);
        Button btnSubmit = new Button("Submit");
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        add(lName, gc, 0, 0, 1, 1, 0, 0);
        add(tName, gc, 1, 0, 1, 1, 0, 20);
        add(lcomments, gc, 0, 1, 1, 1, 0, 0);
        add(TAreaComments, gc, 1, 1, 1, 1, 0, 60);
        add(btnSubmit, gc, 0, 2, 2, 1, 0, 20);
    }

    void add(Component comp, GridBagConstraints gc, int x, int y, int w, int h, int wx, int wy) {
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = w;
        gc.gridheight = h;
        gc.weightx = wx;
        gc.weighty = wy;
        add(comp, gc);
    }
}
