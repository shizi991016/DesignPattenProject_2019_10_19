import java.util.List;

public class Main {
    public static void printName(FloatParade floatParade) {
        Iterator it = floatParade.getIterator();
        Float theFloat;
        while (it.hasNext()) {
            theFloat = (Float)it.next();
            System.out.print(theFloat.getName() + "   ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        FloatParade floatParade = FloatParade.getInstance();
        Command commands[] = {new ReverseOrderCommand(), new RandomOrderCommand(), new OriginalOrderCommand()};
        printName(floatParade);
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
            printName(floatParade);
        }
    }
}