package product;

/*
 *鸡肉堡类继承自食物类，实现了弱不变模式
 */

import type.Meat_food;
import type.Veg_food;
import type.Meat_or_veg;


public class ChickenBurger extends Food {

    private float price;   //鸡肉堡的价格，属性私有满足不变模式
    private float weight;  //鸡肉堡的重量，属性私有满足不变模式
    private Meat_or_veg am;//桥接模式分类成员
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

    public void setPrice(){
        //对象没有任何方法修改对象的状态，满足不变模式
    }
}
