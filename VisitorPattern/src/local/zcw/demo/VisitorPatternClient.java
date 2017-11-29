package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/29 16:30
 * 版本 1.0.0
 * 描述 TODO
 */
public class VisitorPatternClient {
    public static void main(String[] args) {
        People owner = new People("主人");
        People friend = new People("朋友");
        House house = new House(owner);

        owner.enterSittingRoom(house);
        friend.enterSittingRoom(house);

        owner.enterBedRoom(house);
        friend.enterBedRoom(house);
    }
}
