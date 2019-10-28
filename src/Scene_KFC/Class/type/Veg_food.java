package Scene_KFC.Class.type;
//桥接模式素食分类
public class Veg_food extends Meat_or_veg {
    public void meat_or_veg_classify(){
        System.out.println("  I am vegetable food");
    }
}
