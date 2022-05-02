package factorymethod.teht21;

public class Memory {
    char[] chars = new char[10];

    public Memory() {
        chars[0] = 'r';
        chars[1] = '0';
        chars[2] = 'x';
    }

    void Load(Long position, char data) {
        System.out.println("POS: " + position + " DATA: " + data);
    }
}
