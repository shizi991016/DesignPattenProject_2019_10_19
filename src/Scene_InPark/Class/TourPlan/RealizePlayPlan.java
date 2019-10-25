package Sence_InPark.Class.TourPlan;

public class RealizePlayPlan extends SpecialPlayPlan {
    private StrategyForAfternoonPlan strategy;
    //构造函数
    public RealizePlayPlan(){
        strategy = null;
    }
    //策略模式中通过创建对应策略实例，选择策略
    public void setStrategy(int type){
        if(type == 1){
            strategy = new Strategy1();
        }
        else if(type == 2){
            strategy = new Strategy2();
        }
        else if(type == 3){
            strategy = new Strategy3();
        }
        else{
            strategy = new Strategy1();
        }
    }
    //重写父类中的afternoonPlan()方法，打印下午具体行程
    @Override
    protected void afternoonPlan() {
        strategy.format();
    }
}
