package Scene_InPark.Test;

import Scene_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class StrategyPatternTest {
    public static void strategyPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("17.策略模式(Strategy Pattern)：");
        System.out.println("\n"+"测试一:");
        Scanner scan = new Scanner(System.in);
        RealizePlayPlan mPlan = new RealizePlayPlan();
        int afternoonPlan = 0;
        String morningPlan = "米奇大街 奇想花园";
        mPlan.setMorningPlan(morningPlan);
        System.out.println("游园规划：买票、入场、米奇大街、奇想花园、午饭、下午活动（待计划）、出场、晚饭、住宿");
        System.out.println("strategy1: 过山车 游乐园 滑雪   优势：不排队");
        System.out.println("strategy2: 跳水   跳楼机 跳伞   优势：玩的爽");
        System.out.println("strategy3: 唱     跳     rap    优势：花钱少");
        System.out.println("请选择下午的游玩计划：Strategy1(1),Strategy2(2),Strategy3(3)");
        System.out.print("请输入:");
        if(scan.hasNextInt()){
            afternoonPlan = scan.nextInt();
        }
        mPlan.setStrategy(afternoonPlan);
        mPlan.agendaForTheDay();
        System.out.println("----------------------------------------");
    }
}
