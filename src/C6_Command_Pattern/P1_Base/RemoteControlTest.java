package C6_Command_Pattern.P1_Base;

public class RemoteControlTest {
    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}