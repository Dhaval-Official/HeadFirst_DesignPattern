package C4_Factory_Pattern.Corrpt;

import C4_Factory_Pattern.Corrpt.Pizzas.NYStyleCheesePizza;
import C4_Factory_Pattern.Corrpt.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
//            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
        }
        return null;
    }

}
