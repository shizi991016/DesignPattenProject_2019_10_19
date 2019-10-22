package com.food;

public class drinking extends food{
    public drinking (meat_or_veg am,String name){
        this.am=am;
        this.name=name;
    }
    public void food_classify(){
        System.out.print("I am drinking  "+name);
        am.meat_or_veg_classify();
    }
}
