package C4_Factory_Pattern.P1_Factory_Method;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Praparing "+ name);
        System.out.println("Tossing dough....");
        System.out.println("Adding sauce....");
        System.out.println("Adding toppings: ");
        for(int i=0;i<toppings.size();i++) {
            System.out.print(" "+ toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 mins at 35");
    }

    void cut() {
        System.out.println("Cutting in diagonal slices");
    }

    void box() {
        System.out.println("Place Pizza in a box");
    }

    public String getName() {
        return name;
    }

}
