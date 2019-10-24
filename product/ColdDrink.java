package com.product;

import com.pack.Bottle;
import com.pack.Packing;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing(){
        return  new Bottle();
    }

    @Override
    public  abstract float getPrice();
}
