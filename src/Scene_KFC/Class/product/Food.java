package Scene_KFC.Class.product;

import Scene_KFC.Class.type.Meat_or_veg;
import Scene_KFC.Class.pack.Packing;
import Scene_KFC.Class.pack.Wrapper;

public abstract class Food implements Item{


    @Override
    public Packing packing(){
        return new Wrapper("paper");
    }

    @Override
    public abstract float getPrice();
}
