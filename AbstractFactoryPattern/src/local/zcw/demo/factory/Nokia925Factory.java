package local.zcw.demo.factory;

/**
 * 作者 zcw
 * 时间 2017/8/29 16:00
 * 描述 专门生产925的工厂，实现诺基亚工厂接口
 */
public class Nokia925Factory implements NokiaFactory {
    @Override
    public NokiaPhone produceNokiaPhone(){
        return new Nokia925();
    }
}
