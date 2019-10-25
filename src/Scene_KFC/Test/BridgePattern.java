package test;

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

        bigmac.meat_or_veg_classify();
        chick.meat_or_veg_classify();
        chips.meat_or_veg_classify();
        coke.meat_or_veg_classify();



    }
}
