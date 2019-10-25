package product;

import pack.Bottle;
import pack.Packing;
/*
 *冷饮抽象类，对食物和冷饮接口的实现
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return  new Bottle();
    }

    @Override
    public  abstract float getPrice();
}
