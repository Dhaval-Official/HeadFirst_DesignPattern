package C3_DecoratorPattern.StarBuzzCafe.Beverages;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        desc = "DarkRoast";
    }

    public double cost() {
        return .99;
    }

}
