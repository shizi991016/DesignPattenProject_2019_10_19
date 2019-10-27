package Sence_InPark.Class.TourPlan;

import Sence_InPark.Class.TourPlan.MyStrategyFactory;
import Sence_InPark.Class.TourPlan.StrategyFactory;

public abstract class StrategyForAfternoonPlan {
    StrategyFactory myStrategies = new MyStrategyFactory();
    //构造函数
    StrategyForAfternoonPlan(){
        initStrategy();
    }
    //初始化策略工厂，向工厂中添加策略
    private void initStrategy() {
        myStrategies.newStrategy("strategy1", "过山车", "游乐园", "滑雪", 1);
        myStrategies.newStrategy("strategy2", "跳水", "跳楼机", "跳伞", 3);
        myStrategies.newStrategy("strategy3", "唱", "跳", "rap", 2);
    }
    //提供接口，打印策略行程以及具体优势
    public void format(){
        carryOut();
    }
    //打印策略行程以及具体优势;
    abstract protected void carryOut();
}
