public class ReverseOrderCommand extends Command {
    protected static FloatParade receiver = FloatParade.getInstance();
    public void action() {
        receiver.reverseOrder();
    }
}