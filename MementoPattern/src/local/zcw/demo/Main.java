package local.zcw.demo;

/**
 * 作者 zcw
 * 时间 2017/11/28 17:06
 * 版本 1.0.0
 * 描述 TODO
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        RolePlayer player = new RolePlayer(100, 50, 1);
        //将游戏保存在0存档
        user.save(0, player);

        //打印游戏角色状态
        player.display();

        //修改血量，保存在1存档
        player.setHealthPoint(player.getHealthPoint() - 10);
        user.save(1, player);

        //打印游戏角色状态
        player.display();

        //读取游戏0存档
        player = user.load(0);

        //打印游戏角色状态
        player.display();
    }
}
