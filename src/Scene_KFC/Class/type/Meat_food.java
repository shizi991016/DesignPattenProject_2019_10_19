package Scene_KFC.Class.type;

/*
 *桥接模式肉食类，继承自荤素属性类
 */
public class Meat_food extends Meat_or_veg {
    //荤素分类方法
    public void meat_or_veg_classify(){
        System.out.println("  I am meat food");
    }
}
