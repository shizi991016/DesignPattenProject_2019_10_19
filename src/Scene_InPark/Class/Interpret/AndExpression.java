package Scene_InPark.Class.Interpret;

/**
 * 非终结符表达式，与判断，实现解释接口
 */
public class AndExpression implements Expression {
    //两组终结符对象
    private Expression areaCharacter = null;
    private Expression shopNumber = null;

    //构造函数，存储终结符对象
    public AndExpression(Expression areaCharacter, Expression shopNumber) {
        this.areaCharacter = areaCharacter;
        this.shopNumber = shopNumber;
    }

    //解释方法 接口，与判断
    public boolean interpret(String context) {
        //拆分上下文为两部分
        String[] str = context.split("-");
        //分别进行解释，结果进行逻辑与，两者均通过解释，才满足解释的要求
        return (areaCharacter.interpret(str[0]) && shopNumber.interpret(str[1]));
    }
}