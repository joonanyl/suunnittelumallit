package factorymethod.teht5;

public class WinCheckbox implements Checkbox{
    @Override
    public void draw() {
        System.out.println(this + " was drawn to the screen");
    }
}
