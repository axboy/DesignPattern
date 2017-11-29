package local.zcw.demo;

import java.util.Arrays;
import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/11/29 14:32
 * 版本 1.0.0
 * 描述 TODO
 */
public class StrategyPatternClient {
    public static void main(String[] args) {
        Context context = new Context();
        List<Integer> arr = Arrays.asList(1, 2, 4, 5, 2, 5, 7);
        context.operate(arr);

        context.setSortStrategy(new QuickSortStrategy());
        context.operate(arr);
    }
}
