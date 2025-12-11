package C6_Command_Pattern.P2_Application;

public class Stereo {

    String location;

    Stereo(String location) {
        this.location = location;
    }

    void on() {
        System.out.println("On the Stereo");
    }

    void off() {
        System.out.println("Off the Stereo");
    }

    void setCD() {
        System.out.println("Play the CD");
    }

    void setDVD() {
        System.out.println("Play the DVD");
    }

    void setVolume(int vol) {
        System.out.println("Set Volume to: "+vol);
    }

    void setRadio() {
        System.out.println("Play the Radio");
    }
}
