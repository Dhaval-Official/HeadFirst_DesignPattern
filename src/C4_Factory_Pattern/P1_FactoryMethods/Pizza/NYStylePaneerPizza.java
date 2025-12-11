package C4_Factory_Pattern.P1_FactoryMethods.Pizza;

public class NYStylePaneerPizza extends Pizza{

    public NYStylePaneerPizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "NY Style Thin Crust Dough";
        sauce = "NY Marinara Sauce";

        toppings.add("Tomato capsicum Cheese");
    }

    public void cut() {
        System.out.println("Cutting Paneer with smooth cut");
    }

}
