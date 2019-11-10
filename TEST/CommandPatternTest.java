package Test;

import HotelScene.Command.*;

/**
 * Command模式测试类
 */
public class CommandPatternTest {
    public static void commandPatternTest() {
        //定义4个命令
        CheckFull[] commands = { new CheckClubLevelRooms(), new CheckDeluxeRooms(),
                                 new CheckJuniorSuites(), new CheckSignatureSuites() };
        //将命令放入invoker中
        Invoker invoker = new Invoker();
        for (CheckFull temp : commands) {
            invoker.add(temp);
        }
        //执行命令
        invoker.launchCheck();
}