import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class mousedrag extends Applet {
    public void init() {
        addMouseListener(new adapter1(this));
        addMouseMotionListener(new adapter2(this));
        addMouseMotionListener(new adapter3(this));
    }
}

class adapter1 extends MouseAdapter {
    mousedrag obj;

    public adapter1(mousedrag obj) {
        this.obj = obj;
    }

    public void mouseClicked(MouseEvent m) {
        obj.showStatus("Mouse Clicked");
    }
}

class adapter2 extends MouseMotionAdapter {
    mousedrag obj;

    public adapter2(mousedrag obj) {
        this.obj = obj;
    }

    public void mouseMoved(MouseEvent m) {
        obj.showStatus("Mouse Moved");
    }
}

class adapter3 extends MouseMotionAdapter {
    mousedrag obj;

    public adapter3(mousedrag obj) {
        this.obj = obj;
    }

    public void mouseDragged(MouseEvent m) {
        obj.showStatus("Mouse Dragged");
    }
}

error : convert to Frame