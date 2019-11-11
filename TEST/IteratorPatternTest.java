package GateScene;

import GateScene.chainOfResponsibility.*;
import GateScene.chainOfResponsibility.item.GlassBottle;
import GateScene.chainOfResponsibility.item.ItemContainer;
import GateScene.chainOfResponsibility.item.NormalItem;

public class IteratorPatternTest {
    public static void iteratorPatternTest() {
        SecurityCheckProcess p = new SecurityCheckProcess();
        p.Use(new SharpItemCheckComponent());
        p.Use(new ExplosiveOrFlammableItemCheckComponent());
        p.Use(new FragileItemCheckComponent());
        ItemContainer bag = new ItemContainer();
        bag.add(new NormalItem());
        bag.add(new NormalItem());
        bag.add(new NormalItem());
        bag = new ItemContainer();
        bag.add(new GlassBottle());
        bag.add(new NormalItem());
        p = new SecurityCheckProcess();
        p.Use(new FragileItemCheckComponent());
        p.Use(new SharpItemCheckComponent());
        p.Use(new ExplosiveOrFlammableItemCheckComponent());
        System.out.println("\nThis is the scene of Design Pattern `Iterator`");
        System.out.println("You will be able to traver all the component in the process by the iterator\n");
        Iterator<SecurityCheckComponent>iter = p.createIterator();
        while (iter.hasNext()){
            SecurityCheckComponent component = iter.next();
            System.out.println("This component is "+component.getDescription());
        }
    }
}
