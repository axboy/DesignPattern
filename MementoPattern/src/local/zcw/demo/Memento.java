package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/28 16:47
 * 版本 1.0.0
 * 描述 存档
 */
public class Memento {

    private int hp;

    private int mp;

    private int state;

    public Memento(int hp, int mp, int state) {
        this.hp = hp;
        this.mp = mp;
        this.state = state;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
