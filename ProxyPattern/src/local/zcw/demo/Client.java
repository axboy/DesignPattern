package local.zcw.demo;

import local.zcw.demo.server.ProxyServer;

/**
 * 作者 zcw
 * 时间 2017/9/1 15:42
 * 描述 客户端
 */
public class Client {

    public static void main(String[] args) {
        ProxyServer proxy = new ProxyServer();
        System.out.println(proxy.viewNews());
    }
}
