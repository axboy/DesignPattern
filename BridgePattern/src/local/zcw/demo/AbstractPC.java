package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 18:38
 * 描述 抽象电脑
 */
public abstract class AbstractPC {

    protected OS os;

    public abstract void changeOS(OS OS);

    public abstract void start();

    public AbstractPC(OS os) {
        this.os = os;
    }
}
