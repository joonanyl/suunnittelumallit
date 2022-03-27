package factorymethod.teht5;

public class SingletonAbstractFactory {
    private static GUIFactory factory;

    public static synchronized GUIFactory getInstance(String os) {
        if (os == "mac") {
            if (factory == null) {
                factory = new MacFactory();
            }
            return factory;
        } else if (os == "windows") {
            if (factory == null) {
                factory = new WinFactory();
            }
            return factory;
        }
        return null;
    }
}
