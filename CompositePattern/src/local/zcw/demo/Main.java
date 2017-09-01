package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/1 12:49
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        AbstractFile root = new Folder("root");
        AbstractFile dir1 = new Folder("dir1");
        AbstractFile dir2 = new Folder("dir2");

        AbstractFile file0 = new File("file0");
        AbstractFile file1 = new File("file1");
        AbstractFile file2 = new File("file2");

        dir1.addFile(file1);
        dir2.addFile(file2);

        root.addFile(file0);
        root.addFile(dir1);
        root.addFile(dir2);

        root.show();
    }
}
