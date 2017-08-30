package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 12:16
 * 描述 TODO
 */
public class SingletonTest3 {

    private static SingletonTest3 instance;

    /**
     * 私有构造函数
     */
    private SingletonTest3() {
    }

    public static synchronized SingletonTest3 getInstance() {
        if (instance == null) {
            instance = new SingletonTest3();
        }
        return instance;
    }
}
