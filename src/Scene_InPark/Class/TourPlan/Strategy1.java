package Scene_InPark.Class.TourPlan;

public class Strategy1 extends Strategy {
    //构造函数;
    Strategy1(String name, String des1, String des2, String des3){
        this.name = name;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.advantage = "不排队";
    }

    //重写父类方法，打印具体优势
    @Override
    public void showAdvantage() {
        System.out.println("不排队");
    }

    //重写父类方法，返回字符串类型的具体优势
    @Override
    public String getAdvantage() {
        return "不排队";
    }
}
