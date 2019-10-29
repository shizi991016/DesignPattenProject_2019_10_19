package Scene_KFC.Class.meal;
/*
*套餐的指导者类，指导套餐的建造者建造套餐
* 实现了建造者模式
 */
public class Director {
    private MealBuilder mealBuilder;

    //设定套餐的建造者
    public void setMealBuilder(MealBuilder mb){mealBuilder=mb;}

    //获得建造出的套餐
    public NormalMeal getMeal(){return mealBuilder.getMeal();}

    //建造套餐
    public void constructMeal() {
        mealBuilder.createNewMeal();
        mealBuilder.buildPart1();
        mealBuilder.buildPart2();
        mealBuilder.buildPart3();
    }

}
