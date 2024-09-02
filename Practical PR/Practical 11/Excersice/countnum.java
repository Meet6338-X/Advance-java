import java.awt.*;
import java.awt.event.*;

public class countnum extends Frame {
    TextArea textArea;
    Button button;

    countnum() {
        textArea = new TextArea("Click button to handle mouse clicks...");
        button = new Button("Click Me!!");
        add(textArea, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                textArea.setText("mouse clicks count  " + Integer.toString(evt.getClickCount()));
            }
        });

    }

    public static void main(String[] args) {
        new countnum();

    }
}
