package Scene_InPark.Class.TourPlan;

public class Plan2 extends StrategyForAfternoonPlan {
    //重写父类RealizePlayPlan中的carryOut()方法
    @Override
    protected void carryOut() {
        System.out.print(myStrategies2.getStrategy(0).getStrategy() + "  ");
    }
}
