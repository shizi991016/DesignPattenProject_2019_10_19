public class OriginalOrderCommand extends Command {
    protected static FloatParade receiver = FloatParade.getInstance();
    public void action() {
        receiver.originalOrder();
    }
}