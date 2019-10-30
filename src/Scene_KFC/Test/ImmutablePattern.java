package Scene_KFC.Test;

import Scene_KFC.Class.pack.Packing;
import Scene_KFC.Class.product.BigMac;

import java.lang.reflect.Parameter;
/*
*不变模式的测试类
 */
public class ImmutablePattern {
    public static void main(String[] args) {
        BigMac bigmac=new BigMac();
        Packing wrapper=bigmac.packing();
        System.out.println("\n" +"classname: (objectid) : method name :action desc");
        System.out.println("----------------------------------------");
        System.out.println("修改之前的材料"+wrapper.getMaterial());
        wrapper.setMaterial();
        System.out.println("修改之后的材料"+wrapper.getMaterial());
        System.out.println("----------------------------------------" + "\n");






    }
}
