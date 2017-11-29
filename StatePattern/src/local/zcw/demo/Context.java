package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 11:20
 * 版本 1.0.0
 * 描述 TODO
 */
public class Context {

    private LightState lightState;

    public Context(LightState lightState) {
        this.lightState = lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public void changeState() {
        lightState.action(this);
        System.out.println("cur state : " + lightState.getState());
    }

}
