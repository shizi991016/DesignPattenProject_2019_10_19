public class RandomOrderCommand extends Command {
    protected static FloatParade receiver = FloatParade.getInstance();
    public void action() {
        receiver.randomOrder();
    }
}