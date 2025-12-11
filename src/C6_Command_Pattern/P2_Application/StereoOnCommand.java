package C6_Command_Pattern.P2_Application;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.on();

    }

    public void undo() {
        stereo.off();
    }
}