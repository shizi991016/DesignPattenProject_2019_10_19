package Test;

import Class.meal.*;


public class DecoratorPattern {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder A_mealbuilder=new AMealBuilder();
        director.setMealBuilder(A_mealbuilder);
        director.constructMeal();;
        NormalMeal mealA=director.getMeal();
        Meal superMeal=new MealDecorator(mealA);
        System.out.println("super Meal");
        superMeal.showItems();
        System.out.println("Total Cost: " +superMeal.getCost());





    }
}
