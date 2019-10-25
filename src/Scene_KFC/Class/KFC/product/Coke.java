package Class.product;

/*
 *可乐类继承自冷饮类，实现了弱不变模式
 */


import Class.type.Meat_or_veg;


public class Coke extends ColdDrink {

    private float price;    //可乐的价格，属性私有满足不变模式
    private float volume;   //可乐的容量，属性私有满足不变模式
    private Meat_or_veg am;//桥接模式分类成员
    public Coke(){
        this.price=7.0f;
        this.volume=300.0f;
    }

    public Coke clone(){//原型模式，复制食物
        Coke coke=new Coke();
        System.out.println("Clone Coke  ");
        return coke;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "Coke";
    }

    public void setPrice(){
        //对象没有任何方法修改对象的状态，满足不变模式
    }
}
