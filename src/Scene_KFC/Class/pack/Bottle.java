package Scene_KFC.Class.pack;

/*
 *瓶子类
 *实现了不变模式
 */

public class Bottle extends Packing {

    //成员属性私有，符合弱不变模式
    private String material;
    @Override
    public  String pack(){
        return "Bottle";
    }

    public Bottle(String Material){
        this.material=Material;
    }

    //成员函数无法改变成员变量，符合弱不变模式
    public void setMaterial(){

    }

    //获得瓶子的材料
    @Override
    public String getMaterial(){
        return this.material;
    }
}
