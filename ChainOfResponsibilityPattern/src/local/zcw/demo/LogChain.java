package local.zcw.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/11/29 15:19
 * 版本 1.0.0
 * 描述 日志链
 */
public class LogChain {

    private List<Log> logs = new ArrayList<>();

    private int index = 0;

    public void doLogChain(String msg) {
        if (index < logs.size()) {
            logs.get(index++).logMessage(this, msg);
        }
    }

    public void addChain(Log log) {
        logs.add(log);
    }
}
