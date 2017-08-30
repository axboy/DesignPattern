package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:27
 * 描述 110v电源，提供100v电压，目标电压，target
 */
public class Power110V implements Power {

    private int dc = 110;

    @Override
    public int output() {
        return dc;
    }
}
