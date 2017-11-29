package local.zcw.demo;

import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/11/29 14:27
 * 版本 1.0.0
 * 描述 快速排序
 */
public class QuickSortStrategy implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> data) {
        System.out.println("进行快速排序...");
        return data;
    }
}
