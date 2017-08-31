package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 18:12
 * 描述 linux
 */
public class LinuxOS implements OS {
    @Override
    public String version() {
        return "linux";
    }
}
