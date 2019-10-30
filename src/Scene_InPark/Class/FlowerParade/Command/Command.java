package Scene_InPark.Class.FlowerParade.Command;
import Scene_InPark.Class.FlowerParade.Floats.*;
import Scene_InPark.Class.FlowerParade.Memento.*;
/**
 * 命令模式，命令类，父类
 */
public abstract class Command {
    //两个对象数组，用于存储执行的命令，以及执行后的备忘录情况，用于undo和redo
    protected static Command[] commands = new Command[20];
    protected static Memento[] mementos = new Memento[20];
    //两个整型变量，用于标识当前执行的命令位置，以及命令的总量
    protected static int numCommands = 0;
    protected static int highWater = 0;
    //获得花车游行实例，作为命令的接收者
    protected static FloatParade receiver = FloatParade.getInstance();
    //抽象方法，子类继承并实现，命令的具体执行
    public abstract void action();
    //执行当前命令
    public void execute() {
        //命令执行前进行备忘录存储
        mementos[numCommands] = receiver.createMemento();
        //存储当前执行命令
        commands[numCommands] = this;
        //确保命令总数同步上升
        if(numCommands > highWater) {
            highWater = numCommands;
        }
        numCommands++;
        //执行，子类中
        action();
    }
    //撤销此次命令执行，即返回当前命令(numCommands指示的)执行前的状态
    public static void undo() {
        //控制不让undo过头
        if(numCommands == 0) {
            System.out.println("Attempt to run off the end!");
            return;
        }
        //从备忘录中获得之前的状态
        receiver.reinstateMemento(mementos[numCommands - 1]);
        numCommands--;
    }
    //执行下一个命令，发生了undo之后redo才有作用，恢复上一次命令撤销前的状态
    public static void redo() {
        //控制不让redo过头
        if(numCommands > highWater) {
            System.out.println("Attempt to run off the end!");
            return;
        }
        //取出命令进行执行
        commands[numCommands].action();
        numCommands++;
    }
}