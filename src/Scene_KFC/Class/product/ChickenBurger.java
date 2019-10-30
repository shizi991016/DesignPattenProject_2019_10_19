package Scene_KFC.Class.product;

/*
 *鸡肉堡类继承自食物类
 * 实现了原型模式
 * 实现了桥接模式
 */


import Scene_KFC.Class.type.Meat_food;
import Scene_KFC.Class.type.Meat_or_veg;



public class ChickenBurger extends Food {


    private float price;
    private float weight;
    public Meat_or_veg am;//桥接模式分类成员

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
