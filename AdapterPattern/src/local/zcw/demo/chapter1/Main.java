package local.zcw.demo.chapter1;

import local.zcw.demo.base.Power;
import local.zcw.demo.base.Power220V;
import local.zcw.demo.base.USDevice;
import local.zcw.demo.base.USPc;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:26
 * 描述 TODO
 */
public class Main {

    public static void main(String[] args) {
        //已有美版电脑，国内220v电源，美式电源转换器
        USDevice device = new USPc();
        Power power = new Power220V();
        USPowerAdapter adapter = new USPowerAdapter(power);

        //直接接入电源开机
        device.open(power);

        //使用适配器开机
        device.open(adapter);
    }
}
