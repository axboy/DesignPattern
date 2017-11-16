package local.zcw.demo.base;

/**
 * 作者 zcw
 * 时间 2017/8/30 16:35
 * 描述 美国的设备，都有一个开机操作，需要110V电源，也可以使用抽象类
 */
public interface USDevice {

    void open(Power110V power);
}
