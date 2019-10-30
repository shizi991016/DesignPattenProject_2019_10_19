package Scene_InPark.Class.FlowerParade.Memento;
import java.util.ArrayList;
/**
 * 备忘录模式，备忘录类
 */
public class Memento {
    //备忘录中存储的花车顺序
    private ArrayList orderState;
    //构造函数，将花车顺序保存
    public Memento(ArrayList orderState) {
        this.orderState = orderState;
    }
    //获得备忘录中存储的花车顺序
    public ArrayList getOrderState() {
        return orderState;
    }
}