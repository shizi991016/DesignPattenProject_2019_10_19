package Scene_KFC.Class.product;

import Scene_KFC.Class.pack.Bottle;
import Scene_KFC.Class.pack.Packing;
/*
 *冷饮抽象类，对食物和冷饮接口的实现
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return  new Bottle("plastic");
    }

    @Override
    public  abstract float getPrice();
}
