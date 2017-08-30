package local.zcw.demo.chapter2;

import local.zcw.demo.base.Power;
import local.zcw.demo.base.Power220V;
import local.zcw.demo.base.USPc;

/**
 * 作者 zcw
 * 时间 2017/8/30 17:27
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        //已有美版电脑，国内220v电源，电脑适配器
        USPc device = new USPc();
        Power power = new Power220V();
        CNPcAdapter adapter = new CNPcAdapter(device);

        //开机操作
        device.open(power);
        adapter.open(power);
    }
}
