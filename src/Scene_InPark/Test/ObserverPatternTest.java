package Scene_InPark.Test;

import Scene_InPark.Class.Broadcast.Broadcast;
import Scene_InPark.Class.Facilitie.Tourist;

import java.util.Scanner;

//通过输入A来改变游园状态，游园状态改变会广播通知所有游客，使得所有游客改变行为
public class ObserverPatternTest {
    public static void observerPatternTest() {

        //实例化广播类
        Broadcast broadcast = new Broadcast();

        //实例化两个游客
        Tourist tourist1 = new Tourist("张三");
        Tourist tourist2 = new Tourist("李四");

        //注册这两个游客
        broadcast.addList(tourist1);
        broadcast.addList(tourist2);

        //方便测试
        System.out.println("\n" +"----------------------------------------");
        System.out.println("14.观察者模式(ObserverPattern)：");
        System.out.println("\n"+"测试一：");
        System.out.print("游园现在为开放状态");
        //选择是否闭园
        System.out.print("请您选择是否要改变游园状态将其置为闭园：A、闭园，B、保持开放");

        //吃入输入
        Scanner sc = new Scanner(System.in);
        String state = sc.next();

        if (state.equals("A")) {

            System.out.println("Broadcast调用changeGardenState(boolean改变游园状态");
            //闭园
            broadcast.changeGardenState(false);

        } else if (state.equals("B")) {
            //维持开放
            broadcast.changeGardenState(true);
        } else {
            System.out.print("字母输入错误，请重新输入");
            new ObserverPatternTest();
        }
        System.out.println("----------------------------------------" + "\n");
    }
}