package C4_Factory_Pattern.P1_FactoryMethods.Pizza;

public class WashingtionDCStyleCheesePizza extends Pizza{

    public WashingtionDCStyleCheesePizza() {
        name = "DC Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggianoo Cheese");
    }

    public void cut() {
        System.out.println("Cutting style upgraded");
    }

}
