package Scene_InPark.Test;

import Scene_InPark.Class.Broadcast.Broadcast;
import Scene_InPark.Class.Facilitie.Tourist;

import java.util.Scanner;

//游客张三委托广播播放寻物寻人启事，广播作为中介者，其他游客接收消息
public class MediatorPatternTest {
    public static void mediatorPatternTest(){

        //实例化广播
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
        System.out.println("15.中介者模式(MediatorPattern)：");
        System.out.println("\n"+"测试一：");
        //游客选择委托广播播放寻人寻物启事
        System.out.println("张三委托广播播报寻人寻物启事");

        System.out.println("请问张三丢失了什么？请输入");

        //张三输入丢失的东西
        Scanner sc2 = new Scanner(System.in);
        String lostName = sc2.next();

        System.out.println("Tourist类调用lookingFor委托广播播报");
        //委托广播广播
        tourist1.lookingFor(lostName, broadcast);
    }
}

