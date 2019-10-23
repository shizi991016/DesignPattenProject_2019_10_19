public class Ask {
    private String[] chars = {"A", "B", "C", "D"};
    private String[] numbers = {"01", "02", "03"};
    private Expression asking;
    public Ask() {
        Expression areaCharacter = new TerminalExpression(chars);
        Expression shopNumber = new TerminalExpression(numbers);
        asking = new AndExpression(areaCharacter, shopNumber);
    }
    public boolean Asking(String context) {
        return asking.interpret(context);
    }
}