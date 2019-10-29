package Scene_KFC.Class.pack;

/*
 *包装纸类
 * 实现了不变模式
 */

public class Wrapper extends Packing {

    //成员属性私有，符合弱不变模式
    private String material;

    //包装函数，返回相应的包装
    @Override
    public String pack(){
        return "Wrapper";
    }
    public  Wrapper(String Material){
        this.material=Material;
    }

    //成员函数无法改变成员变量符合弱不变模式
    public void setMaterial(){

    }

    //获得包装纸的材料
    @Override
    public String getMaterial(){
        return this.material;
    }
}
