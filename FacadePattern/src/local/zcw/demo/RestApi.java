package local.zcw.demo;

import java.util.Calendar;

/**
 * 作者 zcw
 * 时间 2017/9/1 14:52
 * 描述 对外提供的api
 */
public class RestApi {

    /**
     * 查询当月业绩,对外只提供查询当月的接口
     *
     * @return;
     */
    public static int getRecord() {
        Calendar cal = Calendar.getInstance();
        return RemoteService.getRecordByMonth(cal.get(Calendar.MONTH));
    }
}
