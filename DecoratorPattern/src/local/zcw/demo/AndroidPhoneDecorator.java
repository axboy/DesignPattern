package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/31 15:13
 * 描述 安卓手机装饰器，安装了插件
 */
public class AndroidPhoneDecorator extends PhoneDecorator {

    public AndroidPhoneDecorator(AndroidPhone phone) {
        super(phone);
    }

    @Override
    public void call() {
        phone.call();
        System.out.println("360正在保护，滑稽");
    }
}
