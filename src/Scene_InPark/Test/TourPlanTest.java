<<<<<<< HEAD
package Sence_InPark.Test;

import Sence_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class TourPlanTest {
    public void senceTourPlanTest(){
        Scanner scan = new Scanner(System.in);
        String morningPlan = "";
        int afternoonPlan = 0;
        RealizePlayPlan mPlan = new RealizePlayPlan();
        System.out.println("游园规划：买票、入场、上午活动（待计划）、午饭、下午活动（待计划）、出场、晚饭、住宿");
        System.out.println("请自行规划上午计划：");
        if(scan.hasNextLine()) {
            morningPlan = scan.nextLine();
        }
        mPlan.setMorningPlan(morningPlan);
        System.out.println("请选择下午的游玩计划：Strategy1(1),Strategy2(2),Strategy3(3)");
        System.out.println("Strategy1: 过山车 游乐园 滑雪   优势：不排队");
        System.out.println("strategy2: 跳水   跳楼机 跳伞   优势：玩的爽");
        System.out.println("strategy3: 唱     跳     rap    优势：花钱少");
        if(scan.hasNextInt()){
            afternoonPlan = scan.nextInt();
        }
        mPlan.setStrategy(afternoonPlan);
        mPlan.agendaForTheDay();
    }
}
=======
package Sence_InPark.Test;

import Sence_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class TourPlanTest {
    public void senceTourPlanTest(){
        Scanner scan = new Scanner(System.in);
        String morningPlan = "";
        int afternoonPlan = 0;
        RealizePlayPlan mPlan = new RealizePlayPlan();
        System.out.println("游园规划：买票、入场、上午活动（待计划）、午饭、下午活动（待计划）、出场、晚饭、住宿");
        System.out.println("请自行规划上午计划：");
        if(scan.hasNextLine()) {
            morningPlan = scan.nextLine();
        }
        mPlan.setMorningPlan(morningPlan);
        System.out.println("请选择下午的游玩计划：Strategy1(1),Strategy2(2),Strategy3(3)");
        System.out.println("Strategy1: 过山车 游乐园 滑雪   优势：不排队");
        System.out.println("strategy2: 跳水   跳楼机 跳伞   优势：玩的爽");
        System.out.println("strategy3: 唱     跳     rap    优势：花钱少");
        if(scan.hasNextInt()){
            afternoonPlan = scan.nextInt();
        }
        mPlan.setStrategy(afternoonPlan);
        mPlan.agendaForTheDay();
    }
}
>>>>>>> add broadcast
