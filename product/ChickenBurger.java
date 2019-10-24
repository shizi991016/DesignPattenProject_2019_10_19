package com.product;

/*
 *鸡肉堡类继承自食物类，实现了弱不变模式
 */

import com.food.meat_food;
import com.food.meat_or_veg;
import com.food.veg_food;

public class ChickenBurger extends Food {

    private float price;   //鸡肉堡的价格，属性私有满足不变模式
    private float weight;  //鸡肉堡的重量，属性私有满足不变模式
    private meat_or_veg am;//桥接模式分类成员
    public ChickenBurger(){
        this.price=14.0f;
        this.weight=90.0f;
        meat_or_veg am=new meat_food();//食物分类
        this.am= am;
    }

    public ChickenBurger clone(){//原型模式，复制食物
        ChickenBurger chickenburger=new ChickenBurger();
        return ChickenBurger;
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
