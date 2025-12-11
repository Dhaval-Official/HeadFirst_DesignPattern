package C6_Command_Pattern.P2_Application;

public class StereoOffCommand implements Command{
    Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.off();
    }
}
