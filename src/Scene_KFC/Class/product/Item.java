package Scene_KFC.Class.product;

/*
 *食物与冷饮的接口
 */


import Scene_KFC.Class.pack.Packing;
public interface Item {
    public String getName();
    public Packing packing();
    public float getPrice();
}
