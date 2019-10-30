package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;
import java.util.Scanner;
public class SingletonPatternTest {
    public static void singletonPatternTest(){
        //初始化区域和设施
        System.out.println("\n" +"----------------------------------------");
        System.out.println("10.单例模式(Singleton)：");
        System.out.println("\n"+"测试一：");
        DreamIsland dis=DreamIsland.getInstance();
        System.out.println("调用getInstance获取单例成功，准备进行设施初始化");
        DreamIsland.init();
        System.out.println("----------------------------------------" + "\n");
    }
}
