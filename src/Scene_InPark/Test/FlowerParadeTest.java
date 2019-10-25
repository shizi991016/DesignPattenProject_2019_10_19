package Test;
import Scene_InPark.Class.FlowerParade.Command.*;
import Scene_InPark.Class.FlowerParade.Floats.*;
import Scene_InPark.Class.FlowerParade.Memento.*;
import java.util.List;
import java.util.Scanner;

public class FlowerParadeTest {
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
    public static void main(String[] args) {
        //获得花车游行类实例
        FloatParade floatParade = FloatParade.getInstance();
        //初始化部分命令
        Command commands[] = {new ReverseOrderCommand(), new RandomOrderCommand(), new OriginalOrderCommand()};
        //打印初始花车游行序列
        System.out.print("The original: ");
        printName(floatParade);
        //执行命令，并打印执行后花车游行序列
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            printName(floatParade);
        }

        //根据输入执行命令，执行结果会产生相应备忘录
        Scanner sc = new Scanner(System.in);
        System.out.print("[Tips]1:Reverse  2:Random  3:Original  4:undo  5:redo  0:exit : ");
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
            System.out.print("[Tips]1:Reverse  2:Random  3:Original  4:undo  5:redo  0:exit : ");
            flag = sc.nextInt();
        }
        sc.close();
    }
}