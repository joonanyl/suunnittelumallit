package factorymethod.teht22;

public class ControlButton {
    Command command;

    public ControlButton(Command command) {
        this.command = command;
    }

    public void push() {
        command.execute();
    }
}
