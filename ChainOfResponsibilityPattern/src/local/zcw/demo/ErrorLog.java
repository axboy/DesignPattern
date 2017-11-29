package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 15:20
 * 版本 1.0.0
 * 描述 TODO
 */
public class ErrorLog implements Log {
    @Override
    public void logMessage(LogChain logChain, String message) {
        System.out.printf("errorLog: %s\n", message);
        logChain.doLogChain(message);
    }
}
