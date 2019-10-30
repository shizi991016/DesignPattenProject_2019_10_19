package Scene_InPark.Class.TourPlan;

public abstract class StrategyForAfternoonPlan {
    protected StrategyFactory myStrategies1 = new Strategy1Factory();
    protected StrategyFactory myStrategies2 = new Strategy2Factory();
    protected StrategyFactory myStrategies3 = new Strategy3Factory();

    //构造函数
    StrategyForAfternoonPlan(){
        initStrategy();
    }

    //初始化策略工厂，向工厂中添加策略
    private void initStrategy() {
        myStrategies1.newStrategy("strategy1", "过山车", "游乐园", "滑雪");
        myStrategies2.newStrategy("strategy2", "跳水", "跳楼机", "跳伞");
        myStrategies3.newStrategy("strategy3", "唱", "跳", "rap");
    }

    //提供接口，打印策略行程以及具体优势
    public void format(){
        carryOut();
    }

    //打印策略行程以及具体优势;
    abstract protected void carryOut();
}
