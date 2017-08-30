package local.zcw.demo;

import local.zcw.demo.factory.HmdFactory;
import local.zcw.demo.factory.NokiaPhone;
import local.zcw.demo.factory.PhoneTypeErrorException;

/**
 * 作者 zcw
 * 时间 2017/8/29 16:11
 * 描述 测试类
 */
public class Main {

    public static void main(String[] args) throws PhoneTypeErrorException {
        HmdFactory factory = new HmdFactory();
        NokiaPhone phone1 = factory.produceNokiaPhone("Nokia920");
        System.out.println(phone1.info());

        NokiaPhone phone2 = factory.produceNokiaPhone("iPhone");
        System.out.println(phone2.info());
    }
}
