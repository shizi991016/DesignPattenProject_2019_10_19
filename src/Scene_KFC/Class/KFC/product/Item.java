package Class.product;

/*
 *食物与冷饮的抽象类
 */


import pack.Packing;
public interface Item {
    public String getName();
    public Packing packing();
    public float getPrice();
}
