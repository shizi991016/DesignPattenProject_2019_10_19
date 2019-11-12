package Test;

import RestaurantScene.Builder.Order;
import RestaurantScene.Builder.OrderDirector;
import RestaurantScene.Factory.Food;
import RestaurantScene.Flyweight.ConcreteFlyweigtOrder;
import RestaurantScene.Flyweight.FlyweightOrderFactory;

public class SingletonPatternTest {
    public static void SingletonPatternTest()
    {
        OrderDirector od=new OrderDirector();
        Order oder = od.createOderByDirector(new int[]{1, 2,3,4,5,6});
        FlyweightOrderFactory cf = new FlyweightOrderFactory();
        int[] result = cf.getOrderInf(2);
        Food food = new Food();
        food.createFood("aaa",2,"ccc");
    }
}
