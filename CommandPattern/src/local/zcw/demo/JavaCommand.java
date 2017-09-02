package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/2 14:23
 * 描述 java命令
 */
public class JavaCommand extends Command {
    
    public JavaCommand(JavaProgram javaProgram) {
        program = javaProgram;
    }

    @Override
    public void exec(String[] args) {
        System.out.println(program.deal(args));
    }
}
