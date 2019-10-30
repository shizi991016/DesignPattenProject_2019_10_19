package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;

import java.util.Scanner;

public class CompositePatternTest {
    public static void compositePatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("12.组合模式(Composite)：");
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();

        //查询区域
        System.out.println("\n"+"测试一：");
        System.out.println("游乐园调用printAll和printDirectory打印区域内容和位置");
        System.out.println("请输入您要查询的区域名：");
        Scanner sc = new Scanner(System.in);
        String findAreaName=sc.next();
        if(dis.getFacilitie(findAreaName)!=null){
            //打印内容
            System.out.println(findAreaName+"的包含设施和区域为:");
            System.out.println(dis.getFacilitie(findAreaName).printAll());
            //打印位置（目录）
            System.out.println(findAreaName+"的地址为:");
            System.out.println(dis.getFacilitie(findAreaName).printDirectory());
        }
        else{System.out.println("不存在区域"+findAreaName);}

        //查询设施
        System.out.println("\n"+"测试二：");
        System.out.println("游乐园调用printAll和printDirectory打印设施内容和位置");
        System.out.println("请输入您要查询的设施名：");
        String findFcName=sc.next();
        if(dis.getFacilitie(findFcName)!=null){
            //打印内容
            System.out.println(findFcName+"的包含设施和区域为:");
            System.out.println(dis.getFacilitie(findFcName).printAll());
            //打印位置（目录）
            System.out.println(findFcName+"的地址为:");
            System.out.println(dis.getFacilitie(findFcName).printDirectory());
        }
        else{System.out.println("不存在设施"+findFcName);}
        System.out.println("----------------------------------------");
    }
}
