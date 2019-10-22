package com.food;

public class snack extends food{
    public snack (meat_or_veg am,String name){
        this.am=am;
        this.name=name;
    }
    public void food_classify(){
        System.out.print("I am snack  "+name);
        am.meat_or_veg_classify();
    }
}

