package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 15:39
 * 版本 1.0.0
 * 描述 同事基类
 */
public abstract class Colleague {

    protected MainBoard mainBoard;

    abstract void process();

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }
}
