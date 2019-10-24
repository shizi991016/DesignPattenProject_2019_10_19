package test;

import meal.Meal;
import meal.MealDecorator;
import meal.NormalMeal;
import meal.MealBuilder;

public class DecoratorPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        NormalMeal AMeal = mealBuilder.prepareAMeal();

        Meal superMeal=new MealDecorator(AMeal);//使用装饰者类创建新的超级套餐

        System.out.println("super Meal");
        superMeal.showItems();
        System.out.println("Total Cost: " +superMeal.getCost());


    }
}
