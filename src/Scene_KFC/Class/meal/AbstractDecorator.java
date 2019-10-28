package Scene_KFC.Class.meal;
/*
*套餐的抽象装饰类
 */
public abstract class AbstractDecorator implements Meal{
    //持有被装饰类的引用
    private Meal meal;

    //构造函数注入被装饰着
    public AbstractDecorator(Meal meal){
        this.meal=meal;
    }

    @Override
    public void showItems(){
     meal.showItems();
    }

    @Override
    public float getCost(){
        return meal.getCost();
    }
}
