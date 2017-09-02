package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/2 11:55
 * 描述 游戏
 */
public abstract class Game {

    protected abstract void init();

    protected abstract void start();

    protected abstract void end();

    public void play() {
        init();
        start();
        end();
    }
}
