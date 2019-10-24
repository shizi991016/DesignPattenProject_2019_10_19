package meal;

/*
*套餐的建造者类，负责建立套餐对象
 */

import product.*;


public class MealBuilder extends Builder{
    public NormalMeal meal=new NormalMeal();
    @Override
    public void buildAPart1 (){
        meal.addItem(new ChickenBurger());
    }//A套餐
    @Override
    public void buildAPart2 (){
        meal.addItem(new Coke());
    }//A套餐
    @Override
    public void buildAPart3 (){
        meal.addItem(new Chips());
    }//A套餐
    @Override
    public void buildBPart1 (){
        meal.addItem(new BigMac());
    }//B套餐
    @Override
    public void buildBPart2 (){
        meal.addItem(new Juice());
    }//B套餐
    @Override
    public void buildBPart3 (){
        meal.addItem(new Chips());
    }//B套餐
    @Override
    public NormalMeal createMeal()
    {
        return meal;
    }



}
