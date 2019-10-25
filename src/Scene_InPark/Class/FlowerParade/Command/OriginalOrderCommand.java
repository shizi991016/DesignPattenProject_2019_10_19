package Command;
import Floats.*;
/**
 * 命令模式，子类，还原最初花车顺序
 */
public class OriginalOrderCommand extends Command {
    //获得花车游行实例，作为命令的接收者
    protected static FloatParade receiver = FloatParade.getInstance();
    //执行命令
    public void action() {
        System.out.print("Original Order: ");
        receiver.originalOrder();
    }
}