import java.awt.event.*;
import javax.swing.*;

public class comboex implements ItemListener {
    JFrame f;
    JComboBox cb;
    JLabel l;

    comboex() {
        l = new JLabel("");
        f = new JFrame("Combo ex");
        String city[] = { "Solapur", "Pune", "Bangalore", "Mumbai" };
        cb = new JComboBox(city);
        f.setLayout(null);
        cb.setBounds(50, 50, 90, 20);
        l.setBounds(50, 70, 190, 290);
        f.add(cb);
        f.add(l);
        f.setSize(400, 500);
        f.setVisible(true);
        cb.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        String s1 = "You have Selected=";
        l.setText(s1 + (cb.getItemAt(cb.getSelectedIndex())));
    }

    public static void main(String[] args) {
        comboex e = new comboex();
    }
}
