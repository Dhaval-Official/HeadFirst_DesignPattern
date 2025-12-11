package C7_Adapter_Patterns.P1_ObjectAdapter;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }
    public void fly() {
        System.out.println("I’m flying");
    }
}