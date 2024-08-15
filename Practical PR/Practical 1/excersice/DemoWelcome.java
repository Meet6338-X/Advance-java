
//Develop a program using label to display message “WELCOME TO JAVA”.
import java.applet.Applet;
import java.awt.*;

public class DemoWelcome extends Applet {
    Label l;

    public void init() {
        Label l = new Label("WELCOME TO JAVA");
        add(l);
    }
}
