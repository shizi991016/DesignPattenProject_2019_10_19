package Test;

import GateScene.chainOfResponsibility.ExplosiveOrFlammableItemCheckComponent;
import GateScene.chainOfResponsibility.FragileItemCheckComponent;
import GateScene.chainOfResponsibility.SecurityCheckProcess;
import GateScene.chainOfResponsibility.SharpItemCheckComponent;
import GateScene.chainOfResponsibility.item.*;

public class ResponsibilityPatternTest {
    public static void main(String[] args){
        //建立检查对象
        SecurityCheckProcess mCheck = new SecurityCheckProcess();
        //组装责任链
        mCheck.Use(new SharpItemCheckComponent());
        mCheck.Use(new FragileItemCheckComponent());
        mCheck.Use(new ExplosiveOrFlammableItemCheckComponent());
        //初始化背包
        ItemContainer bag1 = new ItemContainer();
        bag1.add(new NormalItem());
        bag1.add(new NormalItem());
        bag1.add(new NormalItem());

        ItemContainer bag2 = new ItemContainer();
        bag2.add(new NormalItem());
        bag2.add(new Knife());
        bag2.add(new NormalItem());

        ItemContainer bag3 = new ItemContainer();
        bag3.add(new Lighter());
        bag3.add(new NormalItem());
        bag3.add(new NormalItem());

        ItemContainer bag4 = new ItemContainer();
        bag4.add(new NormalItem());
        bag4.add(new NormalItem());
        bag4.add(new GlassBottle());
        //开始检查
        boolean succeed = mCheck.process(bag1);
        if(succeed){
            System.out.println("安检通过");
        }else {
            System.out.println("存在违规物品");
        }

        succeed = mCheck.process(bag2);
        if(succeed){
            System.out.println("安检通过");
        }else {
            System.out.println("存在违规物品");
        }

        succeed = mCheck.process(bag3);
        if(succeed){
            System.out.println("安检通过");
        }else {
            System.out.println("存在违规物品");
        }

        succeed = mCheck.process(bag4);
        if(succeed){
            System.out.println("安检通过");
        }else {
            System.out.println("存在违规物品");
        }

    }
}
