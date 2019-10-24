package meal;

public abstract class Builder {
    public abstract void buildAPart1();
    public abstract void buildAPart2();
    public abstract void buildAPart3();

    public abstract void buildBPart1();
    public abstract void buildBPart2();
    public abstract void buildBPart3();

    public abstract NormalMeal createMeal();
}
