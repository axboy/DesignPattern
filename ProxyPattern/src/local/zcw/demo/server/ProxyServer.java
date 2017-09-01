package local.zcw.demo.server;

/**
 * 作者 zcw
 * 时间 2017/9/1 15:48
 * 描述 代理服务器
 */
public class ProxyServer implements Internet {

    private Internet targetServer;

    @Override
    public String viewNews() {
        if (targetServer == null) {
            targetServer = new NewsServer();
        }
        return targetServer.viewNews();
    }
}
