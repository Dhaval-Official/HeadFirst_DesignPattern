package C3_DecoratorPattern.StarBuzzCafe;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc(){
        return beverage.getDesc() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }

}
