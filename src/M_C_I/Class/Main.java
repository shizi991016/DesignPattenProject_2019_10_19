import java.util.List;

public class Main {
    //用于打印花车游行序列中花车的名字
    public static void printName(FloatParade floatParade) {
        Iterator it = floatParade.getIterator();
        Float theFloat;
        while (it.hasNext()) {
            theFloat = (Float)it.next();
            System.out.print(theFloat.getName() + "   ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        //获得花车游行类实例
        FloatParade floatParade = FloatParade.getInstance();
        //初始化部分命令
        Command commands[] = {new ReverseOrderCommand(), new RandomOrderCommand(), new OriginalOrderCommand()};
        //打印初始花车游行序列
        printName(floatParade);
        //执行命令，并打印执行后花车游行序列
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            printName(floatParade);
        }
    }
}