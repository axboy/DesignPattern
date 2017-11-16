package local.zcw.demo.chapter2;

import local.zcw.demo.base.Power;
import local.zcw.demo.base.USPc;

/**
 * 作者 zcw
 * 时间 2017/8/30 17:19
 * 描述 国内电脑适配器，可以想象成到了国内，提供美式电脑，换了一台国内电脑
 */
public class CNPcAdapter extends USPc {

    public CNPcAdapter(USPc usPc) {
        //TODO 各种赋值操作，将美式设备换成国内设备
    }

    public void open(Power power) {
        System.out.println("us pc adapter");
        System.out.println("us pc open with 220v");
    }
}
