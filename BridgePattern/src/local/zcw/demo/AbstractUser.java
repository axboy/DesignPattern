package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 18:38
 * 描述 人，基类
 */
public abstract class AbstractUser implements Phone {

    protected Phone phone;

    public abstract void changePhone(Phone phone);

    public AbstractUser(Phone phone) {
        this.phone = phone;
    }
}
