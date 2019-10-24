package com.food;
//没用上，保留别删
public class principal_food extends food{
    private meat_or_veg am;
    public principal_food (meat_or_veg am){
        this.am=am;

    }
    public void food_classify(){
        System.out.print("I am principal food  ");
        am.meat_or_veg_classify();
    }
}
