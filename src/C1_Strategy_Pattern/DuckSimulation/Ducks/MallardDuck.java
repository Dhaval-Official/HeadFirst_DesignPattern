package C1_Strategy_Pattern.DuckSimulation.Ducks;

import C1_Strategy_Pattern.DuckSimulation.Behaviours.Fly.FlywithWings;
import C1_Strategy_Pattern.DuckSimulation.Behaviours.Quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlywithWings();

    }

    public void Display() {
        System.out.println("I'm a Real Mallad duck");
    }
}
