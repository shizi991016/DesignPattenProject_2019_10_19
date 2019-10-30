package Scene_InPark.Class.FlowerParade.Command;
import Scene_InPark.Class.FlowerParade.Floats.*;
/**
 * 命令模式，子类，随机打乱花车顺序
 */
public class RandomOrderCommand extends Command {
    //获得花车游行实例，作为命令的接收者
    protected static FloatParade receiver = FloatParade.getInstance();
    //执行命令
    public void action() {
        System.out.print("Random Order: ");
        receiver.randomOrder();
    }
}