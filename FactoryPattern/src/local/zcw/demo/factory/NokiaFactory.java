package local.zcw.demo.factory;

/**
 * 作者 zcw
 * 时间 2017/8/29 15:56
 * 描述 诺基亚工厂接口，要制造诺基亚手机，都要实现该接口
 */
public interface NokiaFactory {

    /**
     * 生产诺基亚手机
     *
     * @return
     */
    NokiaPhone produceNokiaPhone(String type) throws PhoneTypeErrorException;
}
