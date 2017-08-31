package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/31 15:07
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        AndroidPhone android = new AndroidPhone();
        AndroidPhoneDecorator decorator = new AndroidPhoneDecorator(android);

        decorator.call();
    }
}
