package factorymethod.teht22;

public class DropCommand implements Command {
    private Screen screen;

    public DropCommand(Screen screen) {
        this.screen = screen;
    }


    @Override
    public void execute() {
        screen.drop();
    }
}
