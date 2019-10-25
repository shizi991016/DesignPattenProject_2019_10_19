package Class.product;

import Class.pack.Bottle;
import pack.Packing;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return  new Bottle();
    }

    @Override
    public  abstract float getPrice();
}
