package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 12:21
 * 版本 1.0.0
 * 描述 TODO
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new AObserver(subject);
        new BObserver(subject);
        subject.setState(1);
    }
}
