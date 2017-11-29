package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 12:27
 * 版本 1.0.0
 * 描述 TODO
 */
public class CloseState extends LightState {

    public CloseState() {
        state = "close";
    }

    @Override
    public void action(Context context) {
        context.setLightState(new OpenState());
    }
}
