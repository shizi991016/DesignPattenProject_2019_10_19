package Class.product;

/*
 *可乐类继承自冷饮类，实现了桥接模式
 */


import Class.type.Meat_or_veg;


public class Coke extends ColdDrink {

    private float price;
    private float volume;
    public Coke(){
        this.price=7.0f;
        this.volume=300.0f;
    }

    public Coke clone(){//原型模式，复制食物
        Coke coke=new Coke();
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


}
