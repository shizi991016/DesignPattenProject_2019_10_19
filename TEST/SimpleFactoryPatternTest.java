package Test;

import RestaurantScene.Composite.Menu;
import RestaurantScene.Factory.SimpleFoodFactory;
import RestaurantScene.Flyweight.FlyweightOrderFactory;

public class SimpleFactoryPatternTest {
    public static void main(String []args){
        SimpleFoodFactory simpleFoodFactory = new SimpleFoodFactory();
        Menu menu = new Menu();
        menu.addFood(simpleFoodFactory.createFood("12",123,"213"));
        menu.addFood(simpleFoodFactory.createFood("12",123,"Pizza"));
        menu.display();
    }
}
