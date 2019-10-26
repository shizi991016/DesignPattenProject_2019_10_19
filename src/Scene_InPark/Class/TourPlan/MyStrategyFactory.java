package Scene_InPark.Class.TourPlan;

public class MyStrategyFactory extends StrategyFactory {
    //重载父类createStrategy()方法，返回MyStrategy实例
    @Override
    public Strategy createStrategy(String name, String des1, String des2, String des3, int advantage) {
        return new MyStrategy(name, des1, des2, des3, advantage);
    }
}

