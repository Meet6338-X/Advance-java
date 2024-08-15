import java.awt.*;

class GridButton extends Frame {
    public GridButton() {
        setLayout(new GridLayout(5, 5, 10, 10));
        for (int i = 1; i <= 25; i++) {
            add(new Button("Button " + i));
        }
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridButton();
    }
}