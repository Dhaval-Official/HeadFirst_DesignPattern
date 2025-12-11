package C4_Factory_Pattern.P1_FactoryMethods.PizzaStore;


import C4_Factory_Pattern.P1_FactoryMethods.Pizza.Pizza;
import C4_Factory_Pattern.P1_FactoryMethods.Pizza.WashingtionDCStyleCheesePizza;
import C4_Factory_Pattern.P1_FactoryMethods.Pizza.WashingtonDCStylePaneerPizza;

public class WashingtonDCPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item) {

        if(item.equals("cheese")) {
            return new WashingtionDCStyleCheesePizza();
        } else if(item.equals("paneer")) {
            return new WashingtonDCStylePaneerPizza();
        }
            return null;

    }

}