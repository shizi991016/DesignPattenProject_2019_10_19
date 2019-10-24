package com.product;
/*
*巨无霸类继承自食物类，实现了弱不变模式
 */


import com.food.meat_or_veg;
import com.food.principal_food;
import com.food.meat_food;

public class BigMac extends Food {
    private float price;                //巨无霸的价格，属性私有满足不变模式
    private float weight;               //巨无霸的重量，属性私有满足不变模式
    private meat_or_veg am;//桥接模式分类成员
    //只有构造函数初始化了价格与重量，满足不变模式
    public BigMac(){
        this.price=15.0f;
        this.weight=100.0f;
        meat_or_veg am=new meat_food();//食物分类
        this.am= am;
    }
    public BigMac clone(){//原型模式，复制食物
        BigMac bigmac=new BigMac();
        return BigMac;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "BigMac";
    }

    public void setPrice(){
        //对象没有任何方法修改对象的状态，满足不变模式
    }

}
