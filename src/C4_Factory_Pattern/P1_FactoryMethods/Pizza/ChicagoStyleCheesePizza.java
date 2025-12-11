package C4_Factory_Pattern.P1_FactoryMethods.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggianoo Cheese");
    }

    public void cut() {
        System.out.println("they cut in square share here");
    }

}
