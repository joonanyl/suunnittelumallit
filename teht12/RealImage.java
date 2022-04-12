package factorymethod.teht12;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    public void showData() {
        System.out.println(filename);
    }
}
