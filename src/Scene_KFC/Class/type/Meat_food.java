package Scene_KFC.Class.type;
//桥接模式肉食分类
public class Meat_food extends Meat_or_veg {
    public void meat_or_veg_classify(){
        System.out.println("  I am meat food");
    }
}
