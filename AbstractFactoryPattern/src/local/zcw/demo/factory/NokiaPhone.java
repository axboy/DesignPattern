package local.zcw.demo.factory;

/**
 * 作者 zcw
 * 时间 2017/8/29 15:42
 * 描述 诺基亚手机都实现该接口
 */
public interface NokiaPhone {

    /**
     * 默认实现，手机信息
     *
     * @return
     */
    default String info() {
        return "this is Nokia Phone";
    }
}
