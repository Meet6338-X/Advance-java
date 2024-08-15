import java.awt.*;

class gridbutton09 extends Frame {
    gridbutton09() {
        setLayout(new GridLayout(3, 3, 10, 10));
        for (int i = 1; i <= 9; i++) {
            add(new Button("" + i));
        }
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        new gridbutton09();
    }
}