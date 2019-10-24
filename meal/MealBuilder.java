package com.meal;

/*
*套餐的建造者类，负责建立套餐对象
 */

import com.product.*;


public class MealBuilder {

    public NormalMeal prepareAMeal (){
        NormalMeal meal = new NormalMeal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        meal.addItem(new Chips());
        return meal;
    }//A套餐

    public NormalMeal prepareBMeal (){
        NormalMeal meal = new NormalMeal();
        meal.addItem(new BigMac());
        meal.addItem(new Juice());
        meal.addItem(new Chips());
        return meal;
    }//B套餐

    public NormalMeal prepareCMeal (){
        NormalMeal meal = new NormalMeal();
        meal.addItem(new BigMac());
        meal.addItem(new Coke());
        meal.addItem(new Chips());
        return meal;
    }//C套餐

    public NormalMeal prepareDMeal (){
        NormalMeal meal = new NormalMeal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        meal.addItem(new Chips());
        return meal;
    }//D套餐
}
