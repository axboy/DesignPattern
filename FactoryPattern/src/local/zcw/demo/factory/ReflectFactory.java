package local.zcw.demo.factory;

/**
 * 作者 zcw
 * 时间 2017/11/16 10:54
 * 版本 1.0.0
 * 描述 利用反射的工厂
 */
public class ReflectFactory {
    public NokiaPhone produceNokiaPhone(Class<?extends NokiaPhone> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        NokiaPhone phone = null;
        return (NokiaPhone) Class.forName(clazz.getName()).newInstance();
    }
}
