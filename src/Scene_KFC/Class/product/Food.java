package Scene_KFC.Class.product;

import Scene_KFC.Class.type.Meat_or_veg;
import Scene_KFC.Class.pack.Packing;
import Scene_KFC.Class.pack.Wrapper;
/*
*抽象类食物，作为薯条，汉堡的抽象父类
 */
public abstract class Food implements Item{

    //对食品进行包装
    @Override
    public Packing packing(){
        return new Wrapper("paper");
    }

    //获得食物的价格
    @Override
    public abstract float getPrice();
}
