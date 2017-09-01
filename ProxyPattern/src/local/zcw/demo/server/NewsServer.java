package local.zcw.demo.server;

/**
 * 作者 zcw
 * 时间 2017/9/1 15:47
 * 描述 新闻服务器，默认权限，client不能new
 */
class NewsServer implements Internet {
    @Override
    public String viewNews() {
        return "news from NewsServer";
    }
}
