package Class.product;

/*
 *鸡肉堡类继承自食物类
 * 实现了原型模式
 * 实现了桥接模式
 */


import Class.type.Meat_food;
import Class.type.Meat_or_veg;



public class ChickenBurger extends Food {

<<<<<<< HEAD:src/Scene_KFC/Class/KFC/product/ChickenBurger.java
    private float price;   //鸡肉堡的价格，属性私有满足不变模式
    private float weight;  //鸡肉堡的重量，属性私有满足不变模式
    public Meat_or_veg am;//桥接模式分类成员
=======
    private float price;
    private float weight;
    private Meat_or_veg am;//桥接模式分类成员
>>>>>>> bbb0ccd023c3d156e1d16f6c8003c82d420f7c7d:src/Scene_KFC/Class/product/ChickenBurger.java
    public ChickenBurger(){
        this.price=14.0f;
        this.weight=90.0f;
        Meat_or_veg am=new Meat_food();//食物分类
        this.am= am;
    }

    public ChickenBurger clone(){//原型模式，复制食物
        ChickenBurger chickenburger=new ChickenBurger();
        return chickenburger;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "Chicken Burger";
    }


}
