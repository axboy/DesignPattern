package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/1 12:51
 * 描述 TODO
 */
public abstract class AbstractFile {

    protected String name;

    protected String type;

    public boolean addFile(AbstractFile file) {
        return false;
    }

    public boolean delFile(AbstractFile file) {
        return false;
    }

    abstract void show();
}
