package C6_Command_Pattern.P2_Application;

public class Light {

    String location;

    Light(String s) {
        this.location = s;
    }

    public void on() {
        System.out.println("Light is ON");
    }

    public void off() {
        System.out.println("Light is OFF");
    }

}
