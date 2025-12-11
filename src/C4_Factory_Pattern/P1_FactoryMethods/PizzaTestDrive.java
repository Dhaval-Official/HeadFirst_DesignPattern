package C4_Factory_Pattern.P1_FactoryMethods;


import C4_Factory_Pattern.P1_FactoryMethods.Pizza.Pizza;
import C4_Factory_Pattern.P1_FactoryMethods.PizzaStore.*;

public class PizzaTestDrive {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore dcStore = new WashingtonDCPizzaStore();
        Pizza pizza;
        try {

//        pizza = nyStore.orderPizza("cheese");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//        nyStore.orderPizza("veggie");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

            pizza = chicagoStore.orderPizza("cheese");
            System.out.println("Joel ordered a " + pizza.getName() + "\n");
//            pizza = chicagoStore.orderPizza("Paneer");
//            System.out.println("Joel ordered a " + pizza.getName() + "\n");

            pizza = dcStore.orderPizza("cheese");
            System.out.println("Dhaval ordered a " + pizza.getName() + "\n");
            pizza = dcStore.orderPizza("paneer");
            System.out.println("Dhaval ordered a " + pizza.getName() + "\n");

        } catch (NullPointerException ne) {
            System.out.println("Pizza you entered is not available");
        }


    }
}