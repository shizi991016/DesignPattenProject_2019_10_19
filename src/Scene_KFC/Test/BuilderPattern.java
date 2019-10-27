package Test;


import Class.meal.*;

public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder A_mealbuilder=new AMealBuilder();
        MealBuilder B_mealbuilder=new BMealBuilder();
        director.setMealBuilder(A_mealbuilder);
        director.constructMeal();;
        NormalMeal mealA=director.getMeal();
        System.out.println("A Meal");
        mealA.showItems();
        System.out.println("Total Cost: " +mealA.getCost());

        director.setMealBuilder(B_mealbuilder);
        director.constructMeal();;
        NormalMeal mealB=director.getMeal();
        System.out.println("B Meal");
        mealB.showItems();
        System.out.println("Total Cost: " +mealB.getCost());

    }
}
