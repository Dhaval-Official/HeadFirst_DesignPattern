package C4_Factory_Pattern.P1_FactoryMethod.Stores;

import C4_Factory_Pattern.P1_FactoryMethod.Pizzas.NYStyleCheesePizza;
import C4_Factory_Pattern.P1_FactoryMethod.Pizzas.Pizza;

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
