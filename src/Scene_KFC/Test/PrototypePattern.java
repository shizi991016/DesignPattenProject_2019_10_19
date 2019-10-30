package Scene_KFC.Test;

import Scene_KFC.Class.product.*;
import Scene_KFC.Class.type.*;

public class PrototypePattern {
    public static void main(String[] args) {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("26.原型模式(PrototypePattern)：");
        System.out.println("\n"+"测试一：");

        BigMac bigmac=new BigMac();
        System.out.println("Creat BigMac  ");
        BigMac bigmac1=bigmac.clone();

        ChickenBurger chick=new ChickenBurger();
        System.out.println("Creat ChickenBurger  ");
        ChickenBurger chick1=chick.clone();

        Chips chips=new Chips();
        System.out.println("Creat Chips  ");
        Chips chips1=chips.clone();

        Coke coke=new Coke();
        System.out.println("Creat Coke  ");
        Coke coke1=coke.clone();

        System.out.println("\n" +"----------------------------------------");






    }
}
