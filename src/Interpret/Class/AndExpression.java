public class AndExpression implements Expression {
    private Expression areaCharacter = null;
    private Expression shopNumber = null;
    public AndExpression(Expression areaCharacter, Expression shopNumber) {
        this.areaCharacter = areaCharacter;
        this.shopNumber = shopNumber;
    }
    public boolean interpret(String context) {
        String[] str = context.split("-");
        return (areaCharacter.interpret(str[0]) && shopNumber.interpret(str[1]));
    }
}