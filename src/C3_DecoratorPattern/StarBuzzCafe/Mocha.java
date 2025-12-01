package C3_DecoratorPattern.StarBuzzCafe;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc(){
        return beverage.getDesc() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }


}
