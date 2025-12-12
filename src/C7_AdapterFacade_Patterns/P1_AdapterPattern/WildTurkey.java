package C7_AdapterFacade_Patterns.P1_AdapterPattern;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    public void fly() {
        System.out.println("I’m flying a short distance");
    }
}