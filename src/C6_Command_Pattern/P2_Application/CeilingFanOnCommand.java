package C6_Command_Pattern.P2_Application;

public class CeilingFanOnCommand implements Command{
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    public void execute() {
       fan.medium();
    }
    public void undo() {
        fan.off();
    }

}
