package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 15:17
 * 版本 1.0.0
 * 描述 TODO
 */
public class Client {
    public static void main(String[] args) {
        LogChain logChain = new LogChain();
        logChain.addChain(new InfoLog());
        logChain.addChain(new ErrorLog());

        logChain.doLogChain("test");
    }
}
