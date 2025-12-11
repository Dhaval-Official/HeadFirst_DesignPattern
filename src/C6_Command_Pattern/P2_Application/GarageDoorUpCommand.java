package C6_Command_Pattern.P2_Application;

public class GarageDoorUpCommand {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
    public void undo() {
        garageDoor.down();
    }
}
