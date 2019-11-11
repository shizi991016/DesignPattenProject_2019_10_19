package RestaurantScene;

import RestaurantScene.Builder.OrderDirector;

public class BuilderPatternTest {
    public static void builderPatternTest(){
        System.out.println("******  Following Shows A Brief Description Of Builder Pattern  ******");
        Restaurant restaurant=new Restaurant();
        restaurant.Order();
        restaurant.Cooking();
        restaurant.Serve();
    }
}
