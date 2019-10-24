package test;

import meal.*;

public class DecoratorPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilderA = new MealBuilder();
        Director directorA = new Director(mealBuilderA);
        directorA.constructA();
        NormalMeal MealA = mealBuilderA.createMeal();

        Meal superMeal=new MealDecorator(MealA);//使用装饰者类创建新的超级套餐

        System.out.println("super Meal");
        superMeal.showItems();
        System.out.println("Total Cost: " +superMeal.getCost());


    }
}
