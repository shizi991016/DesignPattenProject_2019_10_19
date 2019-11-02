package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;

import java.util.Scanner;

public class AbstractFactoryPatternTest {
    public static void abstractFactoryPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("11. 抽象工厂模式(Abstract Factory)：");
        System.out.println("\n"+"测试：");
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();

        System.out.println("\n"+"请输入您要创建的新设施名称：");
        Scanner sc = new Scanner(System.in);
        String mName=sc.next();
        while (dis.getFacilitie(mName)!=null)
        {
            System.out.println("已经存在名为"+mName+"的区域，请重新输入名称！");
            mName=sc.next();
        }
        Facilitie mfc=dis.getFacilitie(mName,1);
        System.out.println("使用设施工厂创建设施成功");
        System.out.println("\n"+"请输入您要创建的新设施所在的区域名：");
        String fcParentArea=sc.next();
        while(dis.getFacilitie(fcParentArea)==null||fcParentArea.equals(mName))
        {
            System.out.println("请输入正确的名字！");
            fcParentArea=sc.next();
        }
        dis.getFacilitie(fcParentArea).addChild(mfc);
        System.out.println("\n"+"当前游乐园结构为：");
        System.out.println(dis.getFacilitie("DreamIsland").printAll());
        System.out.println("----------------------------------------" + "\n");
    }
}
