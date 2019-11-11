package Test;

import RestaurantScene.Composite.Menu;
import RestaurantScene.Composite.MenuPart;
import RestaurantScene.Factory.*;
import RestaurantScene.Factory.Pizza;

public class CompositePatternTest {
    public static void main(String[] args){
        Menu menu = new Menu();
        //实例化一个pizza对象
        Pizza lovePizza = new Pizza();
        lovePizza.setPrice(100);
        lovePizza.setName("lovePizza");

        menu.addFood(lovePizza);
        menu.display();
    }
}
