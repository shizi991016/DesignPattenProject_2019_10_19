package Interpret;
/**
 * 用于配置上下问环境的类，产生两组终结符对象，并产生非终结符对象
 */
public class Ask {
    //两组终结符
    private String[] chars = {"A", "B", "C", "D"};
    private String[] numbers = {"01", "02", "03"};
    //非终结符对象
    private Expression asking;
    //构造函数，配置问题上下文
    public Ask() {
        //产生终结符对象，传入的参数是终结符
        Expression areaCharacter = new TerminalExpression(chars);
        Expression shopNumber = new TerminalExpression(numbers);
        //产生非终结符对象，解释的中间过程，所以需要传入非终结符对象
        asking = new AndExpression(areaCharacter, shopNumber);
    }
    //外部调用函数，通过解释器解释上下文，返回解释结果
    public boolean Asking(String context) {
        return asking.interpret(context);
    }
}