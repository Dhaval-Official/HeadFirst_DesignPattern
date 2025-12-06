package C3_DecoratorPattern.StarBuzzCafe;

import C3_DecoratorPattern.StarBuzzCafe.Beverages.*;

public class StarBuzzCoffee {

    public static void main(String[] arge) {

        Beverage beverage = new Expresso();

        System.out.println(beverage.getDesc() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDesc() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDesc() + " $" + beverage3.cost());

        Beverage beverage4 = new Decaf();

        beverage4 = new Soy(new Mocha(new Whip(new SteamMilk(beverage4))));


        System.out.println(beverage4.getDesc() + " $" + beverage4.cost());


    }

}
