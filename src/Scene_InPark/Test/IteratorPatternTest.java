package Scene_InPark.Test;

import Scene_InPark.Class.FlowerParade.Floats.*;

/**
 * 迭代器测试类，提供静态函数用于测试
 * 测试使用迭代器，将花车序列对象中的花车ArrayList容器中的花车名字输出
 */
public class IteratorPatternTest {
    public static void iteratorPatternTest() {
        System.out.println("\n" +"classname: (objectid) : method name :action desc");
        System.out.println("----------------------------------------");

        //获得花车游行类实例
        FloatParade floatParade = FloatParade.getInstance();

        //打印花车游行序列
        System.out.print("花车游行序列为: ");
        Iterator it = floatParade.getIterator();
        Floats theFloat;
        while (it.hasNext()) {
            theFloat = (Floats)it.next();
            System.out.print(theFloat.getName() + "   ");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("----------------------------------------");
    }
}