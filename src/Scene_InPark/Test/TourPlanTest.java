package Sence_InPark.Test;

import Sence_InPark.Class.TourPlan.RealizePlayPlan;

import java.util.Scanner;

public class SenceTourPlanTest {
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
        if(scan.hasNextInt()){
            afternoonPlan = scan.nextInt();
        }
        mPlan.setStrategy(afternoonPlan);
        mPlan.agendaForTheDay();
    }
}
