package com.food;
//没用上，保留别删
public class drinking extends food{
    private meat_or_veg am;
    public drinking (meat_or_veg am){
        this.am=am;

    }
    public void food_classify(){
        System.out.print("I am drinking  ");
        am.meat_or_veg_classify();
    }
}
