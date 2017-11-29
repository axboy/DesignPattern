package local.zcw.demo;

import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/11/29 14:29
 * 版本 1.0.0
 * 描述
 */
public class Context {

    private SortStrategy sortStrategy;

    public Context() {
        sortStrategy = new BubbleSortStrategy();
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public List<Integer> operate(List<Integer> data) {
        return sortStrategy.sort(data);
    }
}
