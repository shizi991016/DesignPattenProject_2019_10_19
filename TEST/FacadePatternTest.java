package RestaurantScene;

import RestaurantScene.Facade.*;

public class FacadePatternTest {
    public static void FacadePatternTest(){
        System.out.println("******  Facade Pattern Test ******");
        Restaurant restaurant = new Restaurant();
        restaurant.Order();
        restaurant.Cooking();
        restaurant.Serve();
    }
}
