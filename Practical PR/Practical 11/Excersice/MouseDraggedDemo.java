import java.awt.*;
import java.awt.event.*;

public class MouseDraggedDemo extends Frame {
    private Label statusLabel;

    public MouseDraggedDemo() {
        setTitle("Mouse Dragged Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        statusLabel = new Label("Status: ");
        add(statusLabel);

        addMouseListener(new Adapter1(this));
        addMouseMotionListener(new Adapter2(this));
        addMouseMotionListener(new Adapter3(this));

        setVisible(true);
    }

    public void updateStatus(String message) {
        statusLabel.setText("Status: " + message);
    }

    public static void main(String[] args) {
        MouseDraggedDemo t = new MouseDraggedDemo();
    }
}

class Adapter1 extends MouseAdapter {
    private MouseDraggedDemo obj;

    public Adapter1(MouseDraggedDemo obj) {
        this.obj = obj;
    }

    public void mouseClicked(MouseEvent m) {
        obj.updateStatus("Mouse Clicked");
    }
}

class Adapter2 extends MouseMotionAdapter {
    private MouseDraggedDemo obj;

    public Adapter2(MouseDraggedDemo obj) {
        this.obj = obj;
    }

    public void mouseMoved(MouseEvent m) {
        obj.updateStatus("Mouse Moved");
    }
}

class Adapter3 extends MouseMotionAdapter {
    private MouseDraggedDemo obj;

    public Adapter3(MouseDraggedDemo obj) {
        this.obj = obj;
    }

    public void mouseDragged(MouseEvent m) {
        obj.updateStatus("Mouse Dragged");
    }
}