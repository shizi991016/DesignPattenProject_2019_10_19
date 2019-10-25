package Test;


import Class.meal.Director;
import Class.meal.MealBuilder;
import Class.meal.NormalMeal;

public class BuilderPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilderA = new MealBuilder();
        Director directorA = new Director(mealBuilderA);
        directorA.constructA();
        NormalMeal mealA=mealBuilderA.createMeal();
        System.out.println("A Meal");
        mealA.showItems();
        System.out.println("Total Cost: " +mealA.getCost());

        MealBuilder mealBuilderB = new MealBuilder();
        Director directorB = new Director(mealBuilderB);
        directorB.constructB();
        NormalMeal mealB=mealBuilderB.createMeal();
        System.out.println("A Meal");
        mealB.showItems();
        System.out.println("Total Cost: " +mealB.getCost());

        /*NormalMeal BMeal = mealBuilder.prepareBMeal();
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
        System.out.println("Total Cost: " +DMeal.getCost());*/
    }
}
