package local.zcw.demo;

import local.zcw.demo.builder.BuilderDirector;
import local.zcw.demo.builder.NokiaPhoneBuilder;
import local.zcw.demo.builder.Phone;

/**
 * 作者 zcw
 * 时间 2017/8/30 10:58
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = BuilderDirector.producePhone(new NokiaPhoneBuilder());
        System.out.println(phone.info());
    }
}
