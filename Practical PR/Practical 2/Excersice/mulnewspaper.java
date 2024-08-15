
// Develop  an applet/application to select multiple names of news Papers.
import java.applet.*;
import java.awt.*;

public class mulnewspaper extends Frame {
    mulnewspaper() {
        setSize(200, 300);
        setVisible(true);
        List l = new List(10, true);
        l.add("Sakal");
        l.add("Times of India");
        l.add("Lokmat");
        l.add("Pune Times");
        l.add("Maharashtra Times");
        l.add("Kesari");
        l.add("Prabhat");
        l.add("Pune Mirror");
        l.add("Indian Times");
        l.add("Pudari");
        add(l);
    }

    public static void main(String[] args) {
        mulnewspaper r = new mulnewspaper();
    }
}
