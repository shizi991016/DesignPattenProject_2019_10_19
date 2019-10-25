package Class.meal;
/*
 *套餐的抽象建造者类，定义了一系列抽象方法
 * 其中buildAPart1-3为建造A套餐所需的步骤
 * buildBPart1-3为建造B套餐所需的步骤
 */
public abstract class MealBuilder {
    protected NormalMeal meal;
    public abstract void buildPart1();
    public abstract void buildPart2();
    public abstract void buildPart3();

    public NormalMeal getMeal(){return meal;}
    public void createNewMeal(){meal=new NormalMeal();}
}
