package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/28 16:34
 * 版本 1.0.0
 * 描述 游戏角色
 */
public class RolePlayer {

    /**
     * 血量
     */
    private int healthPoint;

    /**
     * 蓝量
     */
    private int magicPoint;

    /**
     * 状态
     */
    private int state;

    public void display() {
        System.out.println("hp:" + healthPoint + ",mp:" + magicPoint + ",state:" + state);
    }

    public RolePlayer(int healthPoint, int magicPoint, int state) {
        this.healthPoint = healthPoint;
        this.magicPoint = magicPoint;
        this.state = state;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
