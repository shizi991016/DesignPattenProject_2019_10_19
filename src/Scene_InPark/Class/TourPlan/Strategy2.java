package Scene_InPark.Class.TourPlan;

import Scene_InPark.Class.TourPlan.StrategyForAfternoonPlan;

public class Strategy2 extends StrategyForAfternoonPlan {
    //重写父类RealizePlayPlan中的carryOut()方法
    @Override
    protected void carryOut() {
        System.out.print(myStrategies.getStrategy(1).getStrategy() + "  ");
    }
}

