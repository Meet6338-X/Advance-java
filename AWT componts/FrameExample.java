import java.awt.*;
public class FrameExample extends Frame {
    public FrameExample() {
        setTitle("Frame Example");
        setSize(300, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FrameExample();
    }
}
