package local.zcw.demo.builder;

/**
 * 作者 zcw
 * 时间 2017/8/30 11:37
 * 描述 可以理解为手机工厂，这里就不命名为factory了
 */
public class BuilderDirector {

    /**
     * 生产手机
     *
     * @param builder;具体的制造工人
     * @return
     */
    public static Phone producePhone(PhoneBuilder builder) {
        builder.createMotherBoard();
        builder.createBattery();
        builder.createScreen();
        return builder.build();
    }
}
