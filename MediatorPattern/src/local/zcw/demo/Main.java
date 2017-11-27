package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 17:26
 * 版本 1.0.0
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        PcCpu cpu = new PcCpu();
        PcScreen screen = new PcScreen();
        PcCdRom cdRom = new PcCdRom();
        MainBoard mainBoard = new MainBoard(cpu, screen, cdRom);
        cdRom.process();
    }
}
