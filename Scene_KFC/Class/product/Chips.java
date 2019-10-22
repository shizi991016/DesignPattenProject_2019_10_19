package product;

/*
 *薯条类继承自食物类，实现了弱不变模式
 */


public class Chips extends Food {

    private float price;    //薯条的价格，属性私有满足不变模式
    private float weight;   //薯条的重量，属性私有满足不变模式

    public Chips(){
        this.price=10.0f;
        this.weight=100;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "Chips";
    }

    public void setPrice(){
        //对象没有任何方法修改对象的状态，满足不变模式
    }
}
