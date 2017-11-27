package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/27 10:43
 * 版本 1.0.0
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        MyContainer container = new AContainer<String>();
        MyIterator iterator = container.getIterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }
}
