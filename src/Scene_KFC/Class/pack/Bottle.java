package Class.pack;

/*
 *瓶子类对包装接口的实现
 */

public class Bottle implements pack.Packing {

    private String material;//成员属性私有，符合弱不变模式
    @Override
    public  String pack(){
        return "Bottle";
    }

    public Bottle(String Material){
        this.material=Material;
    }
    public void setMaterial(){
        //成员函数无法改变成员变量，符合弱不变模式
    }
}
