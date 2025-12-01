package C3_DecoratorPattern.StarBuzzCafe;

public class Expresso extends Beverage{

    public Expresso() {
        desc = "Expresso";
    }

    public double cost() {
        return 1.99;
    }

}