package Scene_InPark.Test;

import Scene_InPark.Class.FlowerParade.Command.*;
import Scene_InPark.Class.FlowerParade.Floats.*;
import Scene_InPark.Class.FlowerParade.Memento.*;
import java.util.List;
import java.util.Scanner;

/**
 * 命令模式测试类，提供静态函数用于测试
 * 测试中将会初始化三个基本命令，并通过演示执行模拟命令过程
 * 测试中将会涉及命令模式、备忘录模式、迭代器模式
 * 测试后半部分允许输入指令来选择相应的命令，并提供undo和redo操作
 */
public class CommandPatternTest {
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
    public static void commandPatternTest(String[] args) {
        System.out.println("\n" +"----------------------------------------");
        System.out.println("21.命令模式(Command Pattern):");

        System.out.println("\n"+"测试一:");
        //获得花车游行类实例
        FloatParade floatParade = FloatParade.getInstance();
        //初始化部分命令
        Command commands[] = {new ReverseOrderCommand(), new RandomOrderCommand(), new OriginalOrderCommand()};
        //打印初始花车游行序列
        System.out.print("花车初始序列: ");
        printName(floatParade);

        //执行一遍初始化的三个命令，并打印执行后花车游行序列、
        System.out.println("几个例子:");
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            printName(floatParade);
        }

        System.out.println("\n"+"测试二:");
        //根据输入执行命令，执行结果会产生相应备忘录
        Scanner sc = new Scanner(System.in);
        System.out.print("[提示]1:翻转  2:随机  3:初始  4:undo  5:redo  0:退出 : ");
        int flag = sc.nextInt();
        while (flag != 0) {
            switch (flag) {
                case 1:
                    commands[0].execute();
                    printName(floatParade);
                    break;
                case 2:
                    commands[1].execute();
                    printName(floatParade);
                    break;
                case 3:
                    commands[2].execute();
                    printName(floatParade);
                    break;
                case 4:
                    Command.undo();
                    printName(floatParade);
                    break;
                case 5:
                    Command.redo();
                    printName(floatParade);
                    break;
            }
            System.out.print("[提示]1:翻转  2:随机  3:初始  4:undo  5:redo  0:退出 : ");
            flag = sc.nextInt();
        }
        
        sc.close();
        System.out.println("----------------------------------------" + "\n");
    }
}