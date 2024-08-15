import java.awt.*;
class try1 extends Frame
{
    MenuBar M;
    Menu file1,edit1,new1;
    MenuItem open1,su1,su2;
    try1()
    {
        M= new MenuBar();
        file1=new Menu("File");
        edit1=new Menu("Edit");
        new1=new Menu("new");
        open1= new MenuItem("Open");
        su1= new MenuItem("filename");
        su2= new MenuItem("textfile");
        setMenuBar(M);
        M.add(file1);
        M.add(edit1);
        file1.add(new1);
        file1.add(open1);
        new1.add(su1);
        new1.add(su2);
        setVisible(true);
        setSize(500,500);
        setTitle("MenuBarDemo");

    }
    public static void main(String args[])
    {
   try1 t1= new try1();
    }
}