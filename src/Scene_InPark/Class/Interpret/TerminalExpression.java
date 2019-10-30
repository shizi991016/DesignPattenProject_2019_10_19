package Scene_InPark.Class.Interpret;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式，实现解释接口
 */
public class TerminalExpression implements Expression {
    //用于存储终结符的集合
    private Set<String> dataSet = new HashSet<String>();

    //构造函数，存储传入的终结符
    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            dataSet.add(data[i]);
        }
    }
    
    //解释方法 接口
    public boolean interpret(String context) {
        if(dataSet.contains(context)) {
            return true;
        }
        return false;
    }
}