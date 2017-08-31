package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/31 15:08
 * 描述 安卓手机，可以打电话
 */
public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("android call");
    }
}
