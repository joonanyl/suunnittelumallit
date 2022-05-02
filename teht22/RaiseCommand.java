package factorymethod.teht22;

public class RaiseCommand implements Command {
    private Screen screen;

    public RaiseCommand(Screen screen) {
        this.screen = screen;
    }


    @Override
    public void execute() {
        screen.raise();
    }
}
