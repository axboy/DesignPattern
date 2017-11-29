package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 11:17
 * 版本 1.0.0
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new CloseState());
        context.changeState();
        context.changeState();
    }
}
