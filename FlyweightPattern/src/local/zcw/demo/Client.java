package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/9/1 15:18
 * 描述 客户端
 */
public class Client {

    public static void main(String[] args) {
        Model model1 = DataFactory.loadData(1);
        Model model2 = DataFactory.loadData(2);
        Model model3 = DataFactory.loadData(1);
        System.out.println(model1.equals(model3));
    }
}
