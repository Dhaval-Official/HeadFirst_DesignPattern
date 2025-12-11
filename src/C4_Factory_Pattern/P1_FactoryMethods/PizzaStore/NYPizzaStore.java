package C4_Factory_Pattern.P1_FactoryMethods.PizzaStore;

import C4_Factory_Pattern.P1_FactoryMethods.Pizza.NYStyleCheesePizza;
import C4_Factory_Pattern.P1_FactoryMethods.Pizza.NYStylePaneerPizza;
import C4_Factory_Pattern.P1_FactoryMethods.Pizza.NYStyleVeggiePizza;
import C4_Factory_Pattern.P1_FactoryMethods.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item) {

        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }else if(item.equals("paneer")) {
            return new NYStylePaneerPizza();
        } else {
            return null;
        }
    }

}