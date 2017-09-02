package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/2 11:57
 * 描述 A游戏
 */
public class AGame extends Game {

    @Override
    protected void init() {
        System.out.println("AGame init");
    }

    @Override
    protected void start() {
        System.out.println("AGame start");
    }

    @Override
    protected void end() {
        System.out.println("AGame end");
    }
}
