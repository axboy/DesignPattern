package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 12:16
 * 描述 TODO
 */
public class SingletonTest1 {

    private static SingletonTest1 instance = new SingletonTest1();

    /**
     * 私有构造函数
     */
    private SingletonTest1() {
    }

    public static SingletonTest1 getInstance() {
        return instance;
    }
}
