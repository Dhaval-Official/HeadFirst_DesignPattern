package C6_Command_Pattern.P2_Application;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}