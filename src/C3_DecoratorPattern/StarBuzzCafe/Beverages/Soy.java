package C3_DecoratorPattern.StarBuzzCafe.Beverages;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc(){
        return beverage.getDesc() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .15;
    }

}