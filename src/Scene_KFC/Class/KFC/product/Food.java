package Class.product;

import Class.type.Meat_or_veg;
import pack.Packing;
import Class.pack.Wrapper;

public abstract class Food implements Item{


    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
