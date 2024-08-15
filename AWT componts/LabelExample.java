import java.awt.*;

public class LabelExample extends Frame {
    public LabelExample() {
        Label label = new Label("This is a Meet Shah");
        add(label);
        setSize(300, 100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new LabelExample();
    }
}
