package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 12:16
 * 描述 懒汉式，线程不安全
 */
public class SingletonTest2 {

    private static SingletonTest2 instance;

    /**
     * 私有构造函数
     */
    private SingletonTest2() {
    }

    public static SingletonTest2 getInstance() {
        if (instance == null) {
            instance = new SingletonTest2();
        }
        return instance;
    }
}
