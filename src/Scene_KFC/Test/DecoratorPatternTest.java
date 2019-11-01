package Scene_KFC.Test;

import Scene_KFC.Class.meal.*;

/*
*装饰器模式的测试类
 */
public class DecoratorPatternTest {
    public static void decoratorPatternTest() {
        Director director = new Director();
        MealBuilder A_mealbuilder=new AMealBuilder();
        director.setMealBuilder(A_mealbuilder);
        director.constructMeal();;
        NormalMeal mealA=director.getMeal();
        Meal superMeal=new MealDecorator(mealA);
        System.out.println("\n" +"----------------------------------------");
        System.out.println("30. 装饰模式(Decorator)：");
        System.out.println("\n测试:");
        System.out.println("创建超级套餐");
        System.out.println("super Meal");
        superMeal.showItems();
        System.out.println("Total Cost: " +superMeal.getCost());
        System.out.println("创建超级套餐成功");
        System.out.println("----------------------------------------" + "\n");





    }
}
