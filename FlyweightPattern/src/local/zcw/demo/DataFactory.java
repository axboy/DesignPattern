package local.zcw.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者 zcw
 * 时间 2017/9/1 15:18
 * 描述 数据工厂
 */
public class DataFactory {

    private static Map<Integer, Model> data = new HashMap<>();

    public static Model loadData(int i) {
        Model model = data.get(i);
        if (model == null) {
            model = new Model(i, "default value");
        }
        return model;
    }
}
