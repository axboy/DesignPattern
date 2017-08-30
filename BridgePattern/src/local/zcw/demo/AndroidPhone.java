package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 18:12
 * 描述 安卓手机
 */
public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("call by android");
    }
}
