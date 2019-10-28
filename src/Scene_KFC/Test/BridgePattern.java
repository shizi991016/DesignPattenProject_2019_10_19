package Scene_KFC.Test;

import Scene_KFC.Class.product.BigMac;
import Scene_KFC.Class.product.ChickenBurger;
import Scene_KFC.Class.product.Chips;
import Scene_KFC.Class.product.Coke;
import Scene_KFC.Class.product.*;
import Scene_KFC.Class.type.*;

public class BridgePattern {
    public static void main(String[] args) {
        BigMac bigmac=new BigMac();
        System.out.println("BigMac  ");
        ChickenBurger chick=new ChickenBurger();
        System.out.println("ChickenBurger  ");
        Chips chips=new Chips();
        System.out.println("Chips  ");
        Coke coke=new Coke();
        System.out.println("Coke  ");

        bigmac.am.meat_or_veg_classify();
        chick.am.meat_or_veg_classify();
        chips.am.meat_or_veg_classify();



    }
}
