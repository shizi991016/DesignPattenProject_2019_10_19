package test;

import meal.Meal;
import meal.MealDecorator;
import meal.NormalMeal;
import meal.MealBuilder;

public class BuilderPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        NormalMeal AMeal = mealBuilder.prepareAMeal();
        System.out.println("A Meal");
        AMeal.showItems();
        System.out.println("Total Cost: " +AMeal.getCost());

        NormalMeal BMeal = mealBuilder.prepareBMeal();
        System.out.println("\n\nB Meal");
        BMeal.showItems();
        System.out.println("Total Cost: " +BMeal.getCost());

        NormalMeal CMeal = mealBuilder.prepareCMeal();
        System.out.println("\n\nC Meal");
        CMeal.showItems();
        System.out.println("Total Cost: " +CMeal.getCost());

        NormalMeal DMeal = mealBuilder.prepareDMeal();
        System.out.println("\n\nD Meal");
        DMeal.showItems();
        System.out.println("Total Cost: " +DMeal.getCost());
    }
}
