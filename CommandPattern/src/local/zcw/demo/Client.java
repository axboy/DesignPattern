package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/2 12:02
 * 描述 TODO
 */
public class Client {
    public static void main(String[] args) {
        JavaCommand javaCommand = new JavaCommand(new JavaProgram());
        javaCommand.exec(null);
    }
}
