package Scene_KFC.Class.product;

/*
 *果汁类继承自冷饮类
 */


public class Juice extends ColdDrink {


    private float price;
    private float volume;

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

}
