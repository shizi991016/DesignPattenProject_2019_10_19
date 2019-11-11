package RestaurantScene;

import RestaurantScene.Builder.OrderDirector;

public class BuilderPatternTest {
    public static void builderPatternTest(){
        System.out.println("******  Following Shows A Brief Description Of Builder Pattern  ******");
        OrderDirector orderDirector = new OrderDirector();
        int[] number=new int[6];
        orderDirector.createOderByDirector(number);

        System.out.println();
    }
}
