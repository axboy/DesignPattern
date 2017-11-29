package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 16:12
 * 版本 1.0.0
 * 描述 房子
 */
public class House {

    private People owner;

    public House(People owner) {
        this.owner = owner;
    }

    public void showSittingRoom(People people) {
        System.out.println(people.name + "进入客厅");
    }

    public void showBedRoom(People people) {
        if (people.equals(owner)) {
            System.out.println(people.name + "进入卧室");
            return;
        }
        System.out.println(people.name + "不是主人，不能进入卧室");
    }
}
