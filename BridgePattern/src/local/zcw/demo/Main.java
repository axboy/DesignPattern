package local.zcw.demo;


/**
 * 作者 zcw
 * 时间 2017/8/30 18:44
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {

        OS linux = new LinuxOS();
        OS win = new WinOS();

        LenovoPC pc = new LenovoPC(linux);
        pc.start();
    }
}
