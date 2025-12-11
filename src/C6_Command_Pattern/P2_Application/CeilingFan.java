package C6_Command_Pattern.P2_Application;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    void high() {
        speed = HIGH;
        System.out.println("fan speed on high");
    }

    void medium() {
        speed = MEDIUM;
        System.out.println("fan speed on mid");
    }

    void low() {
        speed = LOW;
        System.out.println("fan speed on low");
    }

    int getSpeed() {
        return speed;
    }

    void off() {
        speed = OFF;
        System.out.println("Turn the fan off");
    }

}
