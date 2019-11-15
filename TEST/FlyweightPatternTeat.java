package TEST;

import RestaurantScene.Builder.*;
import RestaurantScene.Composite.*;
import RestaurantScene.Factory.*;
import RestaurantScene.Flyweight.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlyweightPatternTeat {
    public static void main(String[] args){

        FlyweightOrderFcatory fwof=new FlyweightOrderFactory();
        int a[]=fwof.getOrderInf(1);
        System.out.println(a);


    }
}
