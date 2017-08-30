package local.zcw.demo.builder;

/**
 * 作者 zcw
 * 时间 2017/8/30 11:06
 * 描述 手机制造工人，定义所必须的技能
 */
public interface PhoneBuilder {

    /**
     * 生产主板
     */
    void createMotherBoard();

    /**
     * 生产电池
     */
    void createBattery();


    /**
     * 生产屏幕
     */
    void createScreen();

    /**
     * 生产、组装手机
     *
     * @return Phone
     */
    Phone build();
}
