package local.zcw.demo;

import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/11/29 14:24
 * 版本 1.0.0
 * 描述 排序策略
 */
public interface SortStrategy {

    List<Integer> sort(List<Integer> data);
}
