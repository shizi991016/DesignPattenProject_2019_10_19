package Scene_KFC.Class.meal;

/*
 *套餐的实际建造者类，负责建立套餐对象
 * 实现了建造者模式
 */

import Scene_KFC.Class.product.*;


public class AMealBuilder extends MealBuilder {
    @Override
    public void buildPart1 (){
        meal.addItem(new ChickenBurger());
    }//A套餐
    @Override
    public void buildPart2 (){
        meal.addItem(new Coke());
    }//A套餐
    @Override
    public void buildPart3 (){
        meal.addItem(new Chips());
    }//A套餐

}
