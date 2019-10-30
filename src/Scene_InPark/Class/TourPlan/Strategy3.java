package Scene_InPark.Class.TourPlan;

public class Strategy3 extends Strategy {
    //构造函数;
    Strategy3(String name, String des1, String des2, String des3){
        this.name = name;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.advantage = "花钱少";
    }

    //重写父类方法，打印具体优势
    @Override
    public void showAdvantage() {
        System.out.println("花钱少");
    }

    //重写父类方法，返回字符串类型的具体优势
    @Override
    public String getAdvantage() {
        return "花钱少";
    }
}
