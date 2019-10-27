package Class.meal;

public class Director {    // 将一个复杂的构建过程与其表示相分离
    private MealBuilder mealBuilder;    // 针对接口编程，而不是针对实现编程
    public void setMealBuilder(MealBuilder mb){mealBuilder=mb;}
    public NormalMeal getMeal(){return mealBuilder.getMeal();}
    public void constructMeal() {   // 控制（定义）一个复杂的构建过程
        mealBuilder.createNewMeal();
        mealBuilder.buildPart1();
        mealBuilder.buildPart2();
        mealBuilder.buildPart3();
    }

}
