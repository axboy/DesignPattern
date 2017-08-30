package local.zcw.demo.factory;

/**
 * 作者 zcw
 * 时间 2017/8/29 16:00
 * 描述 hmd代工厂，实现诺基亚工厂接口
 */
public class HmdFactory {

    /**
     * 生产诺基亚手机
     *
     * @param type;型号
     * @return
     * @throws PhoneTypeErrorException
     */
    public NokiaPhone produceNokiaPhone(String type) throws PhoneTypeErrorException {
        if (type.equals("Nokia920")) {
            return new Nokia920();
        } else if (type.equals("Nokia925")) {
            return new Nokia925();
        }
        throw new PhoneTypeErrorException();
    }
}
