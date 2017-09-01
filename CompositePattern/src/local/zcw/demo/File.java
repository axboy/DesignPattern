package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/1 12:56
 * 描述 TODO
 */
public class File extends AbstractFile {

    public File(String name) {
        super.name = name;
        super.type = "file";
    }

    @Override
    void show() {
        System.out.printf("type: %s\t\tname: %s\n", type, name);
    }
}
