package Scene_InPark.Test;

import Scene_InPark.Class.Broadcast.*;
import Scene_InPark.Class.Facilitie.Tourist;

public class AdapterPatternTest {
    public static void adapterPatternTest(){

        //实例化一个广播
        Broadcast broadcast = new Broadcast();

        //实例化游客
        Tourist tourist1 = new Tourist("张三");
        Tourist tourist2 = new Tourist("李四");
        Tourist tourist3 = new Tourist("王二麻子");

        //注册这三个游客，将他们添加到广播通知名单内
        broadcast.addList(tourist1);
        broadcast.addList(tourist2);
        broadcast.addList(tourist3);

        //方便测试
        System.out.println("\n" +"----------------------------------------");
        System.out.println("16. 适配器模式(AdapterPattern)：");
        System.out.println("\n"+"测试一：");


        System.out.println("新建一个Adapter类，用来切换语言");
        //新建一个适配器，选择切换的语言
        Adapter adapter = new Adapter();

        //将游园闭园语音改为切换的语言
        broadcast.changeGardenState(false, adapter);

        System.out.println("----------------------------------------" + "\n");
    }
}
