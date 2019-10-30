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

    //展示套餐的内容
    @Override
    public void showItems(){
     meal.showItems();
    }

    //获得套餐的价格
    @Override
    public float getCost(){
        return meal.getCost();
    }
}
