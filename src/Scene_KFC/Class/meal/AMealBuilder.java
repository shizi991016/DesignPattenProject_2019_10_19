package Scene_KFC.Class.meal;

/*
 *套餐的实际建造者类，负责建立B套餐对象
 *实现了建造者模式
 */

import Scene_KFC.Class.product.*;


public class AMealBuilder extends MealBuilder {
    //制作A套餐的第一部分
    @Override
    public void buildPart1 (){
        meal.addItem(new ChickenBurger());
    }

    //制作A套餐的第二部分
    @Override
    public void buildPart2 (){
        meal.addItem(new Coke());
    }

    //制作A套餐的第三部分
    @Override
    public void buildPart3 (){
        meal.addItem(new Chips());
    }

}
