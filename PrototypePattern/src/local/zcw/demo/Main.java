package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/8/30 15:00
 * 描述 TODO
 */
public class Main {

    public static void main(String[] args) {
        Shape protoType = new Rectangle();
        Shape cloneShape = (Shape) protoType.clone();

        cloneShape.setType("clone obj");
        System.out.println(protoType.getType());
        System.out.println(cloneShape.getType());
    }
}
