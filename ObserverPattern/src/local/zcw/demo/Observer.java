package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 12:06
 * 版本 1.0.0
 * 描述 观察者
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
