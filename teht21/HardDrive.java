package factorymethod.teht21;

public class HardDrive {
    char Read(long lba, int size) {
        System.out.println("READ:\nBoot sector: " + lba + " size: " + size);
        return '1';
    }
}
