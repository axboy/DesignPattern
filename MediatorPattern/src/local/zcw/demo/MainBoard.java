package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 15:50
 * 版本 1.0.0
 * 描述 电脑主板，中介者
 */
public class MainBoard {
    private Colleague cpu;
    private Colleague screen;
    private Colleague cdRom;


    public MainBoard(PcCpu cpu, PcScreen screen, PcCdRom cdRom) {
        this.cpu = cpu;
        this.screen = screen;
        this.cdRom = cdRom;
        cpu.setMainBoard(this);
        screen.setMainBoard(this);
        cdRom.setMainBoard(this);
    }

    public void deal(int state) {
        switch (state) {
            case 0x01:
                System.out.println("cd读取");
                cpu.process();
                break;
            case 0x11:
                System.out.println("cpu处理");
                screen.process();
                break;
            case 0x21:
                System.out.println("显示器显示");
                break;
            default:
                System.out.println("error");
        }
    }
}
