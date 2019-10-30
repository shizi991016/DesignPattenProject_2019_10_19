package Scene_InPark.Test;

import Scene_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class TemplateMethodTest {
    public static void templateMethodTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("17.模板模式(Template Method)：");
        System.out.println("\n"+"测试一:");
        Scanner scan = new Scanner(System.in);
        String morningPlan = "";
        //获取游园计划模板实例
        RealizePlayPlan mPlan = new RealizePlayPlan();
        //默认设置下午计划
        mPlan.setStrategy(1);
        System.out.println("游园规划：买票、入场、上午活动（待计划）、午饭、过山车、游乐园、滑雪、出场、晚饭、住宿");
        System.out.println("请自行规划上午计划：");
        if(scan.hasNextLine()) {
            morningPlan = scan.nextLine();
        }
        //设置早上游玩计划
        mPlan.setMorningPlan(morningPlan);
        //打印最终游园计划表
        mPlan.agendaForTheDay();
        System.out.println("----------------------------------------");
    }
}
