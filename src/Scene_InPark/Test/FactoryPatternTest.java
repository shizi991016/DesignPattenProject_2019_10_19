package Scene_InPark.Test;

import Scene_InPark.Class.TourPlan.*;

public class FactoryPatternTest {
    public static void factoryPatternTest() {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("18. 工厂模式(Factory Pattern)：");
        System.out.println("\n"+"测试:");

        //初始化策略工厂
        StrategyFactory myStrategies1 = new Strategy1Factory();
        StrategyFactory myStrategies2 = new Strategy2Factory();
        StrategyFactory myStrategies3 = new Strategy3Factory();

        //向策略工厂中添加策略
        myStrategies1.newStrategy("strategy1", "过山车", "游乐园", "滑雪");
        myStrategies2.newStrategy("strategy2", "跳水", "跳楼机", "跳伞");
        myStrategies3.newStrategy("strategy3", "唱", "跳", "rap");

        //输出各策略工厂中策略地名字、项目、优势
        System.out.println("策略1总览：");
        myStrategies1.reportStrategy();
        System.out.println("策略2总览：");
        myStrategies2.reportStrategy();
        System.out.println("策略3总览：");
        myStrategies3.reportStrategy();

        System.out.println("\n" +"----------------------------------------");
    }
}
