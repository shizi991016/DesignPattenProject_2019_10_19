package product;

import type.Meat_or_veg;
import pack.Packing;
import pack.Wrapper;

public abstract class Food implements Item{


    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
