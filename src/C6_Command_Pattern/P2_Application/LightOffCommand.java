package C6_Command_Pattern.P2_Application;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}