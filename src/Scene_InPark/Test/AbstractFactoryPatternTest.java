package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;

import java.util.Scanner;

public class AbstractFactoryPatternTest {
    public static void abstractFactoryPatternTest(){
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();

        System.out.println("\n"+"请输入您要创建的新设施名称：");
        Scanner sc = new Scanner(System.in);
        String mName=sc.next();
        Facilitie mfc=dis.getFacilitie(mName,2);
        System.out.println("\n"+"请输入您要创建的新设施所在的区域名：");
        String fcParentArea=sc.next();
        dis.getFacilitie(fcParentArea).addChild(mfc);
        System.out.println("\n"+"当前游乐园结构为：");
        System.out.println(dis.getFacilitie("DreamIsland").printAll());
    }
}
