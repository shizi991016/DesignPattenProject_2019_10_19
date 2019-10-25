package Sence_InPark.Class.TourPlan;

public class MyStrategy extends Strategy {
    //构造函数;
    MyStrategy(String name, String des1, String des2, String des3, int advantage){
        this.name = name;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.advantage = advantage;
    }
    //重写父类方法，打印具体优势
    @Override
    public void showAdvantage() {
        if(advantage == 1)
            System.out.println("不用排队");
        if(advantage == 2)
            System.out.println("花钱少");
        if(advantage == 3)
            System.out.println("玩的爽");
    }
    //重写父类方法，返回字符串类型的具体优势
    @Override
    public String getAdvantage() {
        if (advantage == 1)
            return "不用排队";
        if (advantage == 2)
            return "花钱少";
        if (advantage == 3)
            return "玩的爽";
        return "不用排队";
    }
}
