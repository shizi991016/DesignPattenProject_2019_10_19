package Scene_InPark.Class.TourPlan;

public class Strategy1Factory extends StrategyFactory {
    //重载父类createStrategy()方法，返回MyStrategy实例
    @Override
    public Strategy createStrategy(String name, String des1, String des2, String des3) {
        return new Strategy1(name, des1, des2, des3);
    }
}
