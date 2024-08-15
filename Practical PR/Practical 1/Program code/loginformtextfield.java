import java.awt.*;
import java.awt.event.*;

public class loginformtextfield extends Frame {
    public TextField textField;
    public TextArea textArea;
    public Button submitButton;
    public Label messageLabel;

    public loginformtextfield() {
        setTitle("Form Applet");
        setLayout(new FlowLayout());
        textField = new TextField(20);
        textArea = new TextArea(5, 20);
        submitButton = new Button("Submit");
        messageLabel = new Label("");
        add(new Label("Enter your name:"));
        add(textField);
        add(new Label("Enter your message:"));
        add(textArea);
        add(submitButton);
        add(messageLabel);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new loginformtextfield();
    }
}