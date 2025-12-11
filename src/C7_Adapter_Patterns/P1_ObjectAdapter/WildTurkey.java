package C7_Adapter_Patterns.P1_ObjectAdapter;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    public void fly() {
        System.out.println("I’m flying a short distance");
    }
}