package local.zcw.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/9/1 14:22
 * 描述 TODO
 */
public class Folder extends AbstractFile {

    List<AbstractFile> files = new ArrayList<>();

    public Folder(String name) {
        super.name = name;
        super.type = "folder";
    }

    @Override
    public boolean addFile(AbstractFile file) {
        return files.add(file);
    }

    @Override
    public boolean delFile(AbstractFile file) {
        return files.remove(file);
    }

    @Override
    void show() {
        System.out.printf("type: %s\tname: %s\n", type, name);
        files.forEach(file -> file.show());
    }
}
