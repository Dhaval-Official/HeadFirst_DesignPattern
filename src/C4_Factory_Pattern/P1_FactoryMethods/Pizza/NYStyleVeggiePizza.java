package C4_Factory_Pattern.P1_FactoryMethods.Pizza;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza() {
        name = "NY Style Vegetable Pizza";
        dough = "NY Style Thin Crust Dough";
        sauce = "NY Marinara Sauce";

        toppings.add("Tomato capsicum Onion ");
    }

    public void cut() {
        System.out.println("Cutting veggies with Veggie cutter");
    }

}
