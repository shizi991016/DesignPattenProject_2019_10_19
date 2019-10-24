package com.product;

import com.food.meat_or_veg;
import com.pack.Packing;
import com.pack.Wrapper;

public abstract class Food implements Item{


    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
