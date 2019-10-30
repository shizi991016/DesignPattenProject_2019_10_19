package Scene_InPark.Class.TourPlan;

public class Strategy2 extends Strategy {
    //构造函数;
    Strategy2(String name, String des1, String des2, String des3){
        this.name = name;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.advantage = "玩的爽";
    }

    //重写父类方法，打印具体优势
    @Override
    public void showAdvantage() {
        System.out.println("玩的爽");
    }

    //重写父类方法，返回字符串类型的具体优势
    @Override
    public String getAdvantage() {
        return "玩的爽";
    }
}
