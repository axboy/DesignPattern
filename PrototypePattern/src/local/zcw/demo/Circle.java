package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 15:04
 * 描述 TODO
 */
public class Circle extends Shape {

    public Circle() {
        setType("circle");
    }

    @Override
    void draw() {
        System.out.println("draw a " + getType());
    }
}
