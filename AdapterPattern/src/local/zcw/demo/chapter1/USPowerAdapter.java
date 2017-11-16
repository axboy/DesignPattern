package local.zcw.demo.chapter1;

import local.zcw.demo.base.Power110V;
import local.zcw.demo.base.Power220V;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:33
 * 描述 电源适配器，通过修改电源达到目的
 */
public class USPowerAdapter extends Power110V {

    public USPowerAdapter(Power220V power) {

    }

    @Override
    public int output() {
        System.out.println("adapter >>> convert to 110v");
        return 110;
    }
}
