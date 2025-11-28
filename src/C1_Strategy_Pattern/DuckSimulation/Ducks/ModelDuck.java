package C1_Strategy_Pattern.DuckSimulation.Ducks;

import C1_Strategy_Pattern.DuckSimulation.Behaviours.Fly.FlyNoWay;
import C1_Strategy_Pattern.DuckSimulation.Behaviours.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }

    public void Display() {
        System.out.println("I'm a model duck");
    }
}
