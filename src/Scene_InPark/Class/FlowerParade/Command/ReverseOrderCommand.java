package Scene_InPark.Class.FlowerParade.Command;
import Scene_InPark.Class.FlowerParade.Floats.*;
/**
 * 命令模式，子类，反转当前花车顺序
 */
public class ReverseOrderCommand extends Command {
    //获得花车游行实例，作为命令的接收者
    protected static FloatParade receiver = FloatParade.getInstance();
    //执行命令
    public void action() {
        System.out.print("Reverse Order: ");
        receiver.reverseOrder();
    }
}