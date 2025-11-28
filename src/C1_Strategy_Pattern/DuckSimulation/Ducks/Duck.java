package C1_Strategy_Pattern.DuckSimulation.Ducks;

import C1_Strategy_Pattern.DuckSimulation.Behaviours.Fly.FlyBehaviour;
import C1_Strategy_Pattern.DuckSimulation.Behaviours.Quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {}

    public abstract void Display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks Float");
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviout(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

}