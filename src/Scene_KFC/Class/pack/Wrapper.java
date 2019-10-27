package Class.pack;

/*
 *包装纸类对包装接口的实现
 */

public class Wrapper implements pack.Packing {
    private String material;//成员属性私有，符合弱不变模式
    @Override
    public String pack(){
        return "Wrapper";
    }//包装函数，返回相应的包装
    public  Wrapper(String Material){
        this.material=Material;
    }
    public void setMaterial(){
        //成员函数无法改变成员变量符合弱不变模式
    }
}
