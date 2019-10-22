package com.food;

public abstract class food {
    protected meat_or_veg am;
    protected String name;
    public abstract void food_classify();
    public void setName(String name) {
        this.name = name;
    }
}
