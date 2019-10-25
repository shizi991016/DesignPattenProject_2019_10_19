package Class.meal;

/*
*普通套餐类，其中添加product包中的Item
 */

import Class.product.Item;

import java.util.ArrayList;
import java.util.List;

public class NormalMeal implements Meal{
    private List<Item> items = new ArrayList<Item>();  //每个套餐用于放产品的容器

    public void addItem(Item item){
        items.add(item);
    }  //向套餐中加入产品

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }//获得套餐价格

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.getName());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.getPrice());
        }
    }//显示套餐中产品
}