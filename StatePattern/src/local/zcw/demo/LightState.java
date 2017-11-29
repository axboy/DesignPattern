package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 11:18
 * 版本 1.0.0
 * 描述 电灯状态基类
 */
public abstract class LightState {

    protected String state;

    public String getState() {
        return state;
    }

    abstract void action(Context context);
}
