<<<<<<< HEAD
package Sence_InPark.Class.TourPlan;

public abstract class Strategy {
    protected String name;
    protected String des1;
    protected String des2;
    protected String des3;
    protected int advantage;
    //获得策略实例名称
    public String getName(){
        return name;
    }
    //返回字符串类型的策略行程
    public String getStrategy(){
        return des1 + "  " + des2 + "  " +des3;
    }
    //抽象函数，打印该策略的具体优势
    public abstract void showAdvantage();
    //抽象函数，返回该策略字符串类型的具体优势
    public abstract String getAdvantage();
}
=======
package Sence_InPark.Class.TourPlan;

public abstract class Strategy {
    protected String name;
    protected String des1;
    protected String des2;
    protected String des3;
    protected int advantage;
    //获得策略实例名称
    public String getName(){
        return name;
    }
    //返回字符串类型的策略行程
    public String getStrategy(){
        return des1 + "  " + des2 + "  " +des3;
    }
    //抽象函数，打印该策略的具体优势
    public abstract void showAdvantage();
    //抽象函数，返回该策略字符串类型的具体优势
    public abstract String getAdvantage();
}
>>>>>>> add broadcast
