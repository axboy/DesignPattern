package local.zcw.demo.builder;

/**
 * 作者 zcw
 * 时间 2017/8/30 11:09
 * 描述 手机实体类
 */
public class Phone {

    /**
     * 主板
     */
    private String motherBoard;

    /**
     * 屏幕
     */
    private String screen;

    /**
     * 电池
     */
    private String battery;

    public String info() {
        return "主板：" + motherBoard
                + "，屏幕：" + screen
                + "，电池：" + battery;
    }

    /////////set、get方法
    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
}
