package Test;

import Class.product.BigMac;
import Class.product.ChickenBurger;
import Class.product.Chips;
import Class.product.Coke;
import product.*;
import type.*;

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
        coke.am.meat_or_veg_classify();



    }
}
