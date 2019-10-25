package Sence_InPark.Class.TourPlan;

import Sence_InPark.Class.TourPlan.Strategy;

import java.util.ArrayList;

public abstract class StrategyFactory {
    private ArrayList<Strategy> strategies = new ArrayList<Strategy>();
    int index;
    //构造函数，初始化index;
    StrategyFactory(){
        index =  0;
    }
    //向策略工厂的容器中添加新创建的策略
    public void newStrategy(String name, String des1, String des2, String des3, int advantage){
        strategies.add(index, createStrategy(name, des1, des2, des3, advantage));
        index ++;
    }
    //报告策略工厂目前存储的所有的策略
    public void reportStrategy(){
        System.out.println("目前游览策略总浏览:");
        for(int i = 0; i < strategies.size(); i++)
        {
            System.out.print(strategies.get(i).getStrategy() + "  优势：");
            strategies.get(i).showAdvantage();
        }
    }
    //获得策略工厂容器中对应序号的策略实例
    public Strategy getStrategy(int i){
        return strategies.get(i);
    }
    //抽象函数，创造并初始化策略实例
    public abstract Strategy createStrategy(String name, String des1, String des2, String des3, int advantage);
}
