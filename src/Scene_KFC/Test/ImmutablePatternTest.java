package Scene_KFC.Test;

import Scene_KFC.Class.pack.Packing;
import Scene_KFC.Class.product.BigMac;

import java.lang.reflect.Parameter;
/*
*不变模式的测试类
 */
public class ImmutablePatternTest {
    public static void immutablePatternTest() {
        BigMac bigmac=new BigMac();
        Packing wrapper=bigmac.packing();
        System.out.println("\n" +"----------------------------------------");
        System.out.println("28.不变模式(Immutable)：");
        System.out.println("\n测试一:");
        System.out.println("修改之前的材料"+wrapper.getMaterial());
        wrapper.setMaterial();
        System.out.println("尝试使用setMaterial()函数进行修改");
        System.out.println("修改之后的材料"+wrapper.getMaterial());
        System.out.println("材料没有发生变化,符合不变模式");
        System.out.println("----------------------------------------" + "\n");






    }
}
