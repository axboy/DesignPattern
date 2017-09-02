package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/2 14:25
 * 描述 maven命令
 */
public class MvnCommand extends Command {

    public MvnCommand(MvnProgram mvnProgram) {
        program = mvnProgram;
    }

    @Override
    public void exec(String[] args) {
        System.out.println(program.deal(args));
    }
}
