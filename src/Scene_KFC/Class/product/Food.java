package Class.product;

import Class.type.Meat_or_veg;
import Class.pack.Packing;
import Class.pack.Wrapper;

public abstract class Food implements Item{


    @Override
    public Packing packing(){
        return new Wrapper("paper");
    }

    @Override
    public abstract float getPrice();
}
