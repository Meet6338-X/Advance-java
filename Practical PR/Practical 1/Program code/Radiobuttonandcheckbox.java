import java.applet.Applet;
import java.awt.*;

public class Radiobuttonandcheckbox extends Applet {
    CheckboxGroup fruitGroup;
    Checkbox apple, banana, orange;
    Checkbox sprinkles, chocolate, nuts;
    Label result;

    public void init() {
        setLayout(new FlowLayout());
        fruitGroup = new CheckboxGroup();
        apple = new Checkbox("Apple", fruitGroup, false);
        banana = new Checkbox("Banana", fruitGroup, false);
        orange = new Checkbox("Orange", fruitGroup, false);
        sprinkles = new Checkbox("Sprinkles");
        chocolate = new Checkbox("Chocolate");
        nuts = new Checkbox("Nuts");
        result = new Label("Select a fruit and toppings.");
        add(apple);
        add(banana);
        add(orange);
        add(sprinkles);
        add(chocolate);
        add(nuts);
        add(result);
    }
}