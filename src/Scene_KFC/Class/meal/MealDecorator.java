package Scene_KFC.Class.meal;
/*
*套餐的装饰类，用来为普通套餐增加额外功能
* 此处是扩展showItems，增加一个米奇的娃娃
 */
public class MealDecorator extends AbstractDecorator {
    public MealDecorator(Meal meal) {

        //调用父类的构造方法
        super(meal);
    }

    private void getGift(){
        System.out.println(" Mickey Doll");
    }

    //增强了功能的showItems方法
    @Override
    public void showItems()
    {
        super.showItems();
        getGift();
    }

}
