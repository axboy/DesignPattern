package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/2 12:59
 * 描述 TODO
 */
public abstract class Command {

    protected Program program;

    /**
     * 执行命令，并输出结果
     *
     * @param args;
     */
    public abstract void exec(String[] args);
}
