package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/31 15:10
 * 描述 抽象装饰器
 */
public abstract class PhoneDecorator implements Phone {

    protected Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }
}
