package C4_Factory_Pattern.Corrpt;

import C4_Factory_Pattern.Corrpt.Pizzas.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "California Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Cheddar Cheese");
    }
    void cut() {
        System.out.println("Cutting the pizza into California style slices");
    }
}
