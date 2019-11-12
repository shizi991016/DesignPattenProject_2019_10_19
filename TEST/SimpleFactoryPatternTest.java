package Test;

import RestaurantScene.Factory.SimpleFoodFactory;
import RestaurantScene.Flyweight.FlyweightOrderFactory;

public class SimpleFactoryPatternTest {
    public static void main(String []args){
        SimpleFoodFactory simpleFoodFactory = new SimpleFoodFactory();
        simpleFoodFactory.createFood("12",123,"213");
        simpleFoodFactory.createFood("12",123,"Pizza");
    }
}
