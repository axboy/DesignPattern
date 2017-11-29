package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 15:18
 * 版本 1.0.0
 * 描述 TODO
 */
public class InfoLog implements Log {
    @Override
    public void logMessage(LogChain logChain, String message) {
        System.out.printf("info log: %s\n", message);
        logChain.doLogChain(message);
    }
}
