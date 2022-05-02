package factorymethod.teht22;

public class CommandTest {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command raise = new RaiseCommand(screen);
        Command drop = new DropCommand(screen);
        ControlButton raiseButton = new ControlButton(raise);
        ControlButton dropButton = new ControlButton(drop);
        raiseButton.push();
        dropButton.push();
    }
}
