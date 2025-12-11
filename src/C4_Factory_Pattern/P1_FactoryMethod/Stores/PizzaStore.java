package C4_Factory_Pattern.P1_FactoryMethod.Stores;

import C4_Factory_Pattern.P1_FactoryMethod.Pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    abstract Pizza createPizza(String type);

}
