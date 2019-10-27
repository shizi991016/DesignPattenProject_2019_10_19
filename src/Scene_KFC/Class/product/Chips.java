package Class.product;

/*
 *薯条类继承自食物类，实现了桥接模式
 */


import Class.type.Meat_or_veg;
import Class.type.Veg_food;


public class Chips extends Food {

<<<<<<< HEAD:src/Scene_KFC/Class/KFC/product/Chips.java
    private float price;    //薯条的价格，属性私有满足不变模式
    private float weight;   //薯条的重量，属性私有满足不变模式
    public Meat_or_veg am;//桥接模式分类成员
=======
    private float price;
    private float weight;
    private Meat_or_veg am;//桥接模式分类成员
>>>>>>> bbb0ccd023c3d156e1d16f6c8003c82d420f7c7d:src/Scene_KFC/Class/product/Chips.java
    public Chips(){
        this.price=10.0f;
        this.weight=100;
        Meat_or_veg am=new Veg_food();//食物分类
        this.am= am;
    }

    public Chips clone(){//原型模式，复制食物
        Chips chips=new Chips();
        return chips;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "Chips";
    }


}