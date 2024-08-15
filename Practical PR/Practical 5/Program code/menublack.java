import java.awt.Frame;
import java.awt.*;

public class menublack extends Frame {
    menublack() {
        setTitle("MenuBar Demo");
        setSize(500, 500);
        setLayout(null);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        Menu mf = new Menu("BLACK");
        mb.add(mf);
        Menu ml = new Menu("BLUE");
        mb.add(ml);
        Menu ma = new Menu("GREEN");
        mb.add(ma);
        Menu mg = new Menu("RED");
        mb.add(mg);
        Menu my = new Menu("YELLOW");
        mb.add(my);
        Menu mc = new Menu("CYAN");
        mb.add(mc);
        Menu mp = new Menu("PINK");
        mb.add(mp);
        Menu mo = new Menu("ORANGE");
        mb.add(mo);

        MenuItem mcg = new MenuItem("GRAY");
        mf.add(mcg);
        mcg.setEnabled(false);
    }

    public static void main(String[] args) {
        menublack md = new menublack();
        md.setVisible(true);
    }
}