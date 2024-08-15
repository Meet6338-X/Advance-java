import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Demolang extends Applet implements ItemListener {
  String msg = " ";
  Checkbox c1, c2, c3, c4;

  public void init() {
    c1 = new Checkbox("MARATHI");
    c2 = new Checkbox("ENGLISH");
    c3 = new Checkbox("HINDI");
    c4 = new Checkbox("SANSKRIT");
    add(c1);
    add(c2);
    add(c3);
    add(c4);
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent ie) {
    if (c1.getState() == true)// && c2.getState()==false && c3.getState()==false && c4.getState()==false)
      msg = c1.getLabel();
    if (c2.getState() == true)
      msg = c2.getLabel();
    if (c3.getState() == true)
      msg = c3.getLabel();
    if (c4.getState() == true)
      msg = c4.getLabel();
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString("You have selected  " + msg, 100, 100);
  }
}