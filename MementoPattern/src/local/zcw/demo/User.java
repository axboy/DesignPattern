package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/28 17:02
 * 版本 1.0.0
 * 描述 游戏用户
 */
public class User {
    private Memento[] gameData = new Memento[10];

    /**
     * 用户保存游戏
     *
     * @param index
     * @param rolePlayer
     */
    public void save(int index, RolePlayer rolePlayer) {
        Memento memento = new Memento(rolePlayer.getHealthPoint(), rolePlayer.getMagicPoint(), rolePlayer.getState());
        gameData[index] = memento;
    }

    /**
     * 读取游戏存档
     *
     * @param index
     * @return
     */
    public RolePlayer load(int index) {
        Memento memento = gameData[index];
        return new RolePlayer(memento.getHp(), memento.getMp(), memento.getState());
    }
}
