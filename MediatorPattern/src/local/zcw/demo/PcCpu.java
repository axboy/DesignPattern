package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 17:02
 * 版本 1.0.0
 * 描述 cpu
 */
public class PcCpu extends Colleague {

    @Override
    void process() {
        mainBoard.deal(0x11);
    }
}
