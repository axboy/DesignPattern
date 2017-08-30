package local.zcw.demo;


/**
 * 作者 zcw
 * 时间 2017/8/30 18:44
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {

        Phone android = new AndroidPhone();
        Phone iPhone = new ApplePhone();

        AUser aUser = new AUser(android);
        aUser.call();
        aUser.changePhone(iPhone);
        aUser.call();

    }
}
