import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {
    private Set<String> dataSet = new HashSet<String>();
    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            dataSet.add(data[i]);
        }
    }
    public boolean interpret(String context) {
        if(dataSet.contains(context)) {
            return true;
        }
        return false;
    }
}