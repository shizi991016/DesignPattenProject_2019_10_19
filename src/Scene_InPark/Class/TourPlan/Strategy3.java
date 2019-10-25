package Sence_InPark.Class.TourPlan;

import Sence_InPark.Class.TourPlan.StrategyForAfternoonPlan;

public class Strategy3 extends StrategyForAfternoonPlan {
    //重写父类RealizePlayPlan中的carryOut()方法
    @Override
    protected void carryOut() {
        System.out.print(myStrategies.getStrategy(2).getStrategy() + "  ");
    }
}
