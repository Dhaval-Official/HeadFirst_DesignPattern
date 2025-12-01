package C3_DecoratorPattern.StarBuzzCafe;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        desc = "DarkRoast";
    }

    public double cost() {
        return .99;
    }

}
