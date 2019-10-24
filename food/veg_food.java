package com.food;
//桥接模式素食分类
public class veg_food extends meat_or_veg{
    public void meat_or_veg_classify(){
        System.out.println("  I am vegetable food");
    }
}
