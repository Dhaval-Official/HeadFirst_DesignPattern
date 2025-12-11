package C4_Factory_Pattern.P1_FactoryMethods.Pizza;

public class WashingtonDCStylePaneerPizza extends Pizza{

    public WashingtonDCStylePaneerPizza() {
        name = "DC Style Sauce and Cheese Pizza";
        dough = "DC Style Thin Crust Dough";
        sauce = "DC Marinara Sauce";

        toppings.add("Tomato capsicum Cheese");
    }

    public void cut() {
        System.out.println("Cutting Paneer with smooth cut");
    }

}
