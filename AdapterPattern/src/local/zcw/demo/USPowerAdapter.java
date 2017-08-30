package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:33
 * 描述 电源适配器
 */
public class USPowerAdapter implements Power {

    private Power power;

    public USPowerAdapter(Power power) {
        this.power = power;
    }

    @Override
    public int output() {
        System.out.println("adapter >>> convert to 110v");
        return 110;
    }
}
