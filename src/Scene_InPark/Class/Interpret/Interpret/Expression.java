package Interpret;
/**
 * 解释器模式中的表达式接口，提供解释方法
 */
public interface Expression {
    public boolean interpret(String context);
}