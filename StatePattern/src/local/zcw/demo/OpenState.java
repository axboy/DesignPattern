package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 12:26
 * 版本 1.0.0
 * 描述 TODO
 */
public class OpenState extends LightState {

    public OpenState() {
        state = "open";
    }

    @Override
    public void action(Context context) {
        context.setLightState(new CloseState());
    }
}
