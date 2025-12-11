package C4_Factory_Pattern.Corrpt;

import C4_Factory_Pattern.Corrpt.Pizzas.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (item.equals("veggie")) {
//            return new CaliforniaStyleVeggiePizza();
        } else if (item.equals("clam")) {
//            return new CaliforniaStyleClamPizza();
        } else if (item.equals("pepperoni")) {
//            return new CaliforniaStylePepperoniPizza();
        }
        return null;
    }
}