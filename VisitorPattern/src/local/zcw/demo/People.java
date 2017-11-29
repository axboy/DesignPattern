package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 16:29
 * 版本 1.0.0
 * 描述 人
 */
public class People {

    public String name;

    public People(String name) {
        this.name = name;
    }

    public void enterSittingRoom(House house) {
        house.showSittingRoom(this);
    }

    public void enterBedRoom(House house) {
        house.showBedRoom(this);
    }
}
