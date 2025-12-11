package C4_Factory_Pattern.P1_FactoryMethods.PizzaStore;

import C4_Factory_Pattern.P1_FactoryMethods.Pizza.Pizza;

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

    protected abstract Pizza createPizza(String type);

}
