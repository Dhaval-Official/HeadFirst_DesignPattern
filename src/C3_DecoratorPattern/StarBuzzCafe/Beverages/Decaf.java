package C3_DecoratorPattern.StarBuzzCafe.Beverages;

public class Decaf extends Beverage{

    public Decaf() {
        desc = "Decaf";
    }

    public double cost() {
        return 1.05;
    }

}

