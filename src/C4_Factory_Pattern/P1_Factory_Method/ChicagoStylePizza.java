package C4_Factory_Pattern.P1_Factory_Method;

public class ChicagoStylePizza extends Pizza{

    public ChicagoStylePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting Pizza in to square slices");
    }

}
