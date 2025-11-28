package C1_Strategy_Pattern.DuckSimulation.Behaviours.Quack;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
