package C3_DecoratorPattern.StarBuzzCafe;

public abstract class Beverage {

    String desc = "Unknown Beverage";

    public String getDesc(){
        return desc;
    }

    public abstract double cost();
}

