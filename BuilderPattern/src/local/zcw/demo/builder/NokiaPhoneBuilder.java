package local.zcw.demo.builder;

/**
 * 作者 zcw
 * 时间 2017/8/30 11:23
 * 描述 诺基亚手机制造工人，建造工具
 */
public class NokiaPhoneBuilder implements PhoneBuilder {

    private Phone phone = null;

    public NokiaPhoneBuilder() {
        phone = new Phone();
    }

    @Override
    public void createMotherBoard() {
        phone.setMotherBoard("诺基亚主板");
    }

    @Override
    public void createBattery() {
        phone.setBattery("3000mAh");
    }

    @Override
    public void createScreen() {
        phone.setScreen("4.5英寸");
    }

    @Override
    public Phone build() {
        return this.phone;
    }
}
