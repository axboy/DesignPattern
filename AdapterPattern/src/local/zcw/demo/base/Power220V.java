package local.zcw.demo.base;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:27
 * 描述 220v电源，提供220v电压，已有条件，被适配者，adaptee
 */
public class Power220V implements Power {

    private int dc = 220;

    @Override
    public int output() {
        return dc;
    }
}
