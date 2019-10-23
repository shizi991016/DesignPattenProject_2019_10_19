import java.util.ArrayList;

public class Memento {
    private ArrayList orderState;
    public Memento(ArrayList orderState) {
        this.orderState = orderState;
    }
    public ArrayList getOrderState() {
        return orderState;
    }
}