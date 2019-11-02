package Scene_KFC.Test;

import Scene_KFC.Class.product.BigMac;
import Scene_KFC.Class.product.ChickenBurger;
import Scene_KFC.Class.product.Chips;
import Scene_KFC.Class.product.Coke;
import Scene_KFC.Class.product.*;
import Scene_KFC.Class.type.*;

public class BridgePatternTest {
    public static void bridgePatternTest() {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("25.桥接模式(BridgePattern)：");
        System.out.println("\n"+"测试一：");


        BigMac bigmac=new BigMac();
        System.out.println("BigMac  ");
        bigmac.am.meat_or_veg_classify();

        ChickenBurger chick=new ChickenBurger();
        System.out.println("ChickenBurger  ");
        chick.am.meat_or_veg_classify();

        Chips chips=new Chips();
        System.out.println("Chips  ");
        chips.am.meat_or_veg_classify();

        System.out.println("\n" +"----------------------------------------");





    }
}
