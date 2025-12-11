package C4_Factory_Pattern.P1_FactoryMethods.PizzaStore;


import C4_Factory_Pattern.P1_FactoryMethods.Pizza.ChicagoStyleCheesePizza;
import C4_Factory_Pattern.P1_FactoryMethods.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item) {

        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else
            return null;

    }

}