package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 18:42
 * 描述 a用户，代理人
 */
public class AUser extends AbstractUser {

    public AUser(Phone phone) {
        super(phone);
    }

    @Override
    public void changePhone(Phone phone) {
        super.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }
}
