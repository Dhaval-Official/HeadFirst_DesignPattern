package C6_Command_Pattern.P2_Application;

public class GarageDoorDownCommand {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
    public void undo() {
        garageDoor.up();
    }
}
