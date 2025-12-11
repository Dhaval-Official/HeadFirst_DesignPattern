package C6_Command_Pattern.P2_Application;

public class GarageDoor {

    GarageDoor(String s) {

    }

    void up() {
        System.out.println("Garage door Open");
    }

    void down() {
        System.out.println("Garage door Close");
    }

    void stop() {
        System.out.println("Garage door Stop");
    }

    void lightOn() {
        System.out.println("Garage Light ON");
    }

    void lightOff() {
        System.out.println("Garage Light OFF");
    }

}
