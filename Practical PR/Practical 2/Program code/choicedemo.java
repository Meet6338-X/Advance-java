import java.awt.*;

class choicedemo extends Frame {
    choicedemo() {
        Frame f = new Frame("CHOICE");
        Choice ch = new Choice();
        ch.add("Summer");
        ch.add("Winter");
        ch.add("Rainy");
        ch.setBounds(150, 150, 100, 25);
        f.add(ch);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        choicedemo rn = new choicedemo();
    }
}