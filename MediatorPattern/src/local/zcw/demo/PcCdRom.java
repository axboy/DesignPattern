package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 17:02
 * 版本 1.0.0
 * 描述 光驱
 */
public class PcCdRom extends Colleague {

    @Override
    void process() {

        mainBoard.deal(0x01);
    }
}
