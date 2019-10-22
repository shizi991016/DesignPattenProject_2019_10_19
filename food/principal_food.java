package com.food;

public class principal_food extends food{
    public principal_food (meat_or_veg am,String name){
        this.am=am;
        this.name=name;
    }
    public void food_classify(){
        System.out.print("I am principal food  "+name);
        am.meat_or_veg_classify();
    }
}
