package C6_Command_Pattern.P2_Application;

public class CeilingFanOffCommand implements Command{
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.off();
    }

    public void undo() {
        fan.medium();
    }
}
