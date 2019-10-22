package com.food;

public class Main {

    public static void main(String[] args) {
	// write your code here
      System.out.println("hello world");
      meat_or_veg am=new meat_food();
      meat_or_veg av=new veg_food();
      food pfood=new principal_food(am,"hamburger");
      food sfood=new snack(av,"fies");
      food dfood=new drinking(av,"coke");
      get_food(pfood);
      get_food(sfood);
      get_food(dfood);



    }
    private static void get_food(food food_type){

        food_type.food_classify();
    }
}
