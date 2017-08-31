package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 18:42
 * 描述 联想电脑，代理者
 */
public class LenovoPC extends AbstractPC {

    public LenovoPC(OS os) {
        super(os);
    }

    @Override
    public void changeOS(OS os) {
        super.os = os;
    }

    @Override
    public void start() {
        System.out.println("lenovo pc,using " + os.version());
    }
}
