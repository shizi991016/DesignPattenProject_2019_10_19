package product;
/*
*巨无霸类继承自食物类，实现了弱不变模式
 */
public class BigMac extends Food {
    private float price;                //巨无霸的价格，属性私有满足不变模式
    private float weight;               //巨无霸的重量，属性私有满足不变模式

    //只有构造函数初始化了价格与重量，满足不变模式
    public BigMac(){
        this.price=15.0f;
        this.weight=100.0f;
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
