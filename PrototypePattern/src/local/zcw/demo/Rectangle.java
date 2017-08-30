package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 15:04
 * 描述 TODO
 */
public class Rectangle extends Shape {

    /**
     * 复杂的构造函数
     */
    public Rectangle() {
        System.out.println("do many things");
        setType("rectangle");
    }

    @Override
    void draw() {
        System.out.println("draw a " + getType());
    }
}
