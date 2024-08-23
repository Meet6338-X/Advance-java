import javax.swing.*;
import java.awt.event.*;

public class jcomboboxindia implements ItemListener {
    JFrame f;
    JComboBox cb;
    JLabel l;

    jcomboboxindia() {
        l = new JLabel("");
        f = new JFrame("Combo ex");
        String states[] = { "Maharastra", "Karnatak", "Gujarat", "Andhra Pradesh", "Goa" };
        cb = new JComboBox(states);
        f.setLayout(null);
        cb.setBounds(50, 50, 200, 20);
        l.setBounds(150, 140, 190, 290);
        f.add(cb);
        f.add(l);

        f.setSize(400, 500);
        f.setVisible(true);
        cb.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        String s1 = "You have Selected=";
        l.setText(s1 + (cb.getSelectedItem()));
    }

    public static void main(String[] args) {
        jcomboboxindia e = new jcomboboxindia();
    }
}
