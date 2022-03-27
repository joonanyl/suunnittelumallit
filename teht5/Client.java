package factorymethod.teht5;

public class Client {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory af) {
        this.factory = af;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void drawUI() {
        button.draw();
        checkbox.draw();
    }
}
