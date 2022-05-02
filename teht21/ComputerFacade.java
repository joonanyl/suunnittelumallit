package factorymethod.teht21;

public class ComputerFacade {

    private CPU cpu_ = new CPU();
    private Memory memory_ = new Memory();
    private HardDrive hard_drive_ = new HardDrive();

    void start() {
        cpu_.Freeze();
        long kBootAddress = 2;
        long kBootSector = 0;
        int kSectorSize = 512;
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();
    }
}
