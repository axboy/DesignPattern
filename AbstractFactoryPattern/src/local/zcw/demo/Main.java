package local.zcw.demo;

import local.zcw.demo.factory.Nokia920Factory;
import local.zcw.demo.factory.Nokia925Factory;
import local.zcw.demo.factory.NokiaFactory;
import local.zcw.demo.factory.NokiaPhone;

/**
 * 作者 zcw
 * 时间 2017/8/29 16:36
 * 描述 TODO
 */
public class Main {

    public static void main(String[] args) {
        NokiaPhone phone;
        NokiaFactory nokia925Factory = new Nokia925Factory();
        phone = nokia925Factory.produceNokiaPhone();
        System.out.println(phone.info());

        NokiaFactory nokia920Factory = new Nokia920Factory();
        phone = nokia920Factory.produceNokiaPhone();
        System.out.println(phone.info());
    }
}
