package Scene_KFC.Test;

import Scene_KFC.Class.product.*;
import Scene_KFC.Class.type.*;

public class PrototypePattern {
    public static void main(String[] args) {
        BigMac bigmac=new BigMac();
        System.out.println("Creat BigMac  ");
        ChickenBurger chick=new ChickenBurger();
        System.out.println("Creat ChickenBurger  ");
        Chips chips=new Chips();
        System.out.println("Creat Chips  ");
        Coke coke=new Coke();
        System.out.println("Creat Coke  ");

        BigMac bigmac1=bigmac.clone();
        ChickenBurger chick1=chick.clone();
        Chips chips1=chips.clone();
        Coke coke1=coke.clone();



    }
}
