package C4_Factory_Pattern.P1_Factory_Method;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Dhaval ordered a " + pizza.getName() + "\n");


    }
}