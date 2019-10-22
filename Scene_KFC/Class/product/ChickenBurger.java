package product;

/*
 *鸡肉堡类继承自食物类，实现了弱不变模式
 */

public class ChickenBurger extends Food {

    private float price;   //鸡肉堡的价格，属性私有满足不变模式
    private float weight;  //鸡肉堡的重量，属性私有满足不变模式

    public ChickenBurger(){
        this.price=14.0f;
        this.weight=90.0f;
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
