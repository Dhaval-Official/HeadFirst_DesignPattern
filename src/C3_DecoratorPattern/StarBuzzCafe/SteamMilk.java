package C3_DecoratorPattern.StarBuzzCafe;

public class SteamMilk extends CondimentDecorator{

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc(){
        return beverage.getDesc() + ", SteamMilk";
    }

    public double cost() {
        return beverage.cost() + .10;
    }


}
