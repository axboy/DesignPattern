package local.zcw.demo.base;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:37
 * 描述 美国的电脑，工作电压为110V，在国内使用需要适配器
 */
public class USPc implements USDevice {
    @Override
    public void open(Power110V power) {
        if (power.output() == 110) {
            System.out.println("us pc open");
        } else {
            System.err.println("us pc error");
        }
    }
}
