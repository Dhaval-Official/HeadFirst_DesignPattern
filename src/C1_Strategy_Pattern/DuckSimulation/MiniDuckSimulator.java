package C1_Strategy_Pattern.DuckSimulation;

import C1_Strategy_Pattern.DuckSimulation.Behaviours.Fly.FlyRocketPowered;
import C1_Strategy_Pattern.DuckSimulation.Ducks.Duck;
import C1_Strategy_Pattern.DuckSimulation.Ducks.MallardDuck;
import C1_Strategy_Pattern.DuckSimulation.Ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
