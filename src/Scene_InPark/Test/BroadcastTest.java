package Scene_InPark.Test;

import Scene_InPark.Class.Broadcast.Adapter;
import Scene_InPark.Class.Broadcast.Broadcast;
import Scene_InPark.Class.Facilitie.Tourist;


import java.util.Scanner;

public class BroadcastTest {
    public static void BroadcastTest() {
        //默认切换语言为中文

        Broadcast broadcast = new Broadcast(); //实例化广播类

        //实例化两个游客
        Tourist tourist1 = new Tourist("张三");
        Tourist tourist2 = new Tourist("李四");

        //注册这两个游客
        broadcast.addList(tourist1);
        broadcast.addList(tourist2);

        //选择是否闭园
        System.out.print("请您选择是否要闭园：A、闭园，B、保持开放");

        Scanner sc = new Scanner(System.in);

        String state = sc.next();

        if( state.equals("A")){
            broadcast.changeGardenState(false);//闭园
        }
        else if( state.equals("B")){
            broadcast.changeGardenState(true);//维持开放
        }
        else {
            System.out.print("字母输入错误，请重新输入");
            BroadcastTest();
        };
        //新建一个适配器，选择切换的语言
        Adapter adapter = new Adapter();

        //将游园闭园语音改为切换的语言
        broadcast.changeGardenState(false, adapter);

        //游客选择委托广播播放寻人寻物启事
        System.out.println("张三委托广播播报寻人寻物启事");

        System.out.println("请问张三丢失了什么？请输入");

        //张三输入丢失的东西
        Scanner sc2 = new Scanner(System.in);
        String lostName = sc2.next();

        tourist1.lookingFor(lostName, broadcast);//委托广播广播
        }

    }

