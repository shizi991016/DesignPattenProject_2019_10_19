package Scene_InPark.Test;

import Scene_InPark.Class.FlowerParade.Command.*;
import Scene_InPark.Class.FlowerParade.Floats.*;
import Scene_InPark.Class.FlowerParade.Memento.*;
import java.util.List;
import java.util.Scanner;

/**
 * 备忘录模式测试类，提供静态函数用于测试
 * 测试中将会初始化三个基本命令，并通过演示执行模拟命令过程
 * 在三个命令执行后将执行两侧undo操作
 * undo操作过程中会使用备忘录，以此测试备忘录模式
 */
public class MementoPatternTest {
    //用于打印花车游行序列中花车的名字，采用迭代器
    public static void printName(FloatParade floatParade) {
        Iterator it = floatParade.getIterator();
        Floats theFloat;
        while (it.hasNext()) {
            theFloat = (Floats)it.next();
            System.out.print(theFloat.getName() + "   ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    //用于测试的静态函数
    public static void mementoPatternTest() {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("22. 备忘录模式(Memento Pattern):");
        
        System.out.println("\n"+"测试:");
        //获得花车游行类实例
        FloatParade floatParade = FloatParade.getInstance();
        //初始化部分命令
        Command commands[] = {new ReverseOrderCommand(), new RandomOrderCommand(), new OriginalOrderCommand()};
        //打印初始花车游行序列
        System.out.print("花车初始序列: ");
        printName(floatParade);
        
        //执行一遍初始化的三个命令，并打印执行后花车游行序列、
        System.out.println("执行三个命令:");
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            printName(floatParade);
        }
        //使用undo操作回退，测试备忘录
        System.out.println("使用undo操作回退两个命令:");
        Command.undo();
        System.out.print("回退结果一: ");
        printName(floatParade);
        Command.undo();
        System.out.print("回退结果二: ");
        printName(floatParade);

        System.out.println("----------------------------------------" + "\n");
    }
}