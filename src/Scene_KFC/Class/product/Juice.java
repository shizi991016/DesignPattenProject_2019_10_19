package Scene_KFC.Class.product;

/*
 *果汁类继承自冷饮类，实现了弱不变模式
 */


public class Juice extends ColdDrink {

    private float price;    //果汁的价格，属性私有满足不变模式
    private float volume;   //果汁的容量，属性私有满足不变模式

    public Juice(){
        this.price=7.0f;
        this.volume=400.0f;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "Juice";
    }

    public void setPrice(){
        //对象没有任何方法修改对象的状态，满足不变模式
    }
}
