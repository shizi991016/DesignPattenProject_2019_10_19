package meal;
/*
 *套餐的抽象建造者类，定义了一系列抽象方法
 * 其中buildAPart1-3为建造A套餐所需的步骤
 * buildBPart1-3为建造B套餐所需的步骤
 */
public abstract class Builder {
    public abstract void buildAPart1();
    public abstract void buildAPart2();
    public abstract void buildAPart3();

    public abstract void buildBPart1();
    public abstract void buildBPart2();
    public abstract void buildBPart3();

    public abstract NormalMeal createMeal();
}
