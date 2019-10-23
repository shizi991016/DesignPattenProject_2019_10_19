public abstract class Command {
    protected static Command[] commands = new Command[20];
    protected static Memento[] mementos = new Memento[20];
    protected static int numCommands = 0;
    protected static int highWater = 0;
    protected static FloatParade receiver = FloatParade.getInstance();
    public abstract void action();
    public void execute() {
        mementos[numCommands] = receiver.createMemento();
        commands[numCommands] = this;
        if(numCommands > highWater) {
            highWater = numCommands;
        }
        numCommands++;
        action();
    }
    public static void undo() {
        if(numCommands == 0) {
            System.out.println("Attempt to run off the end!");
            return;
        }
        receiver.reinstateMemento(mementos[numCommands - 1]);
        numCommands--;
    }
    public static void redo() {
        if(numCommands > highWater) {
            System.out.println("Attempt to run off the end!");
            return;
        }
        commands[numCommands].action();
        numCommands++;
    }
}