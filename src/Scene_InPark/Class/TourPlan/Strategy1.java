<<<<<<< HEAD
package Sence_InPark.Class.TourPlan;

import Sence_InPark.Class.TourPlan.StrategyForAfternoonPlan;

public class Strategy1 extends StrategyForAfternoonPlan {
    //重写父类RealizePlayPlan中的carryOut()方法
    @Override
    protected void carryOut() {
        System.out.print(myStrategies.getStrategy(0).getStrategy() +  "  ");
    }
}
=======
package Sence_InPark.Class.TourPlan;

import Sence_InPark.Class.TourPlan.StrategyForAfternoonPlan;

public class Strategy1 extends StrategyForAfternoonPlan {
    //重写父类RealizePlayPlan中的carryOut()方法
    @Override
    protected void carryOut() {
        System.out.print(myStrategies.getStrategy(0).getStrategy() +  "  ");
    }
}
>>>>>>> add broadcast