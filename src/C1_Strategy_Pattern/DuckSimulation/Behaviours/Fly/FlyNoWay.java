package C1_Strategy_Pattern.DuckSimulation.Behaviours.Fly;

public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("i can't fly");
    }
}
