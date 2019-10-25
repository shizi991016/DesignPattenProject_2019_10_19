package product;
/*
*巨无霸类继承自食物类，实现了弱不变模式
 */


import type.Meat_food;
import type.Veg_food;
import type.Meat_or_veg;

public class BigMac extends Food {
    private float price;                //巨无霸的价格，属性私有满足不变模式
    private float weight;               //巨无霸的重量，属性私有满足不变模式
    private Meat_or_veg am;//桥接模式分类成员
    //只有构造函数初始化了价格与重量，满足不变模式
    public BigMac(){
        this.price=15.0f;
        this.weight=100.0f;
        Meat_or_veg am=new Meat_food();//食物分类
        this.am= am;
    }
    public BigMac clone(){//原型模式，复制食物
        BigMac bigmac=new BigMac();
        System.out.println("Clone BigMac  ");
        return bigmac;
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
