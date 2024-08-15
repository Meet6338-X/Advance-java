import java.awt.*;

public class ListComponent10Cities extends Frame {
    ListComponent10Cities() {
        setSize(200, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        List cityList = new List(10, true);
        cityList.add("Pune");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Delhi");
        cityList.add("Kolhapur");
        cityList.add("Sangli");
        cityList.add("Satara");
        cityList.add("Bangalore");
        cityList.add("Nashik");
        cityList.add("Lonavala");
        add(cityList);
    }

    public static void main(String[] args) {
        new ListComponent10Cities();
    }
}