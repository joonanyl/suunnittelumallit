package factorymethod.teht21;

public class CPU {
    void Freeze() {

    }
    void Jump(long position) {
        System.out.println("JUMP: " + position);
    }
    void Execute() {
        System.out.println("Execute");
    }
}
