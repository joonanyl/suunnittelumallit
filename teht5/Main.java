package factorymethod.teht5;

public class Main {
    public static void main(String[] args) throws Exception {
        GUIFactory factory = null;
        // String os = "mac";
        // String os = "windows";
        String os = "linux";

        if (os == "mac" || os == "windows") {
            factory = SingletonAbstractFactory.getInstance(os);
        } else {
            throw new Exception("You are using an unsupported OS.");
        }

        Client client = new Client(factory);
        client.createUI();
        client.drawUI();
    }
}
