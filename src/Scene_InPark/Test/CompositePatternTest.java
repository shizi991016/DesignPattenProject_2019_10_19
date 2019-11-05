package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;

import java.util.Scanner;

public class CompositePatternTest {
    public static void compositePatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("12.组合模式(Composite)：");
        //获取游乐园单例并初始化游乐园
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();

        //查询区域
        System.out.println("\n"+"测试一：");
        System.out.println("游乐园调用printAll和printDirectory打印区域内容和位置");
        System.out.println("请输入您要查询的区域名：");
        Scanner sc = new Scanner(System.in);
        String findAreaName=sc.next();
        while (dis.getFacilitie(findAreaName)==null||dis.getFacilitie(findAreaName).returnType()==1)
        {
            if(dis.getFacilitie(findAreaName)==null) {
                System.out.println("不存在区域" + findAreaName);
            }
            else{
                System.out.println("这是一个设施！");
            }
            System.out.println("请输入正确的区域名");
            findAreaName=sc.next();
        }
        //打印内容
        System.out.println(findAreaName+"的包含设施和区域为:");
        System.out.println(dis.getFacilitie(findAreaName).printAll());
        //打印位置（目录）
        System.out.println(findAreaName+"的地址为:");
        System.out.println(dis.getFacilitie(findAreaName).printDirectory());

        //查询设施
        System.out.println("\n"+"测试二：");
        System.out.println("游乐园调用printAll和printDirectory打印设施内容和位置");
        System.out.println("请输入您要查询的设施名：");
        String findFcName=sc.next();
        while (dis.getFacilitie(findFcName)==null||dis.getFacilitie(findFcName).returnType()==2)
        {
            if(dis.getFacilitie(findFcName)==null) {
                System.out.println("不存在设施" + findFcName);
            }
            else{
                System.out.println("这是一个区域！");
            }
            System.out.println("请输入正确的设施名");
            findFcName=sc.next();
        }
        //打印内容
        System.out.println(findFcName+"的包含设施和区域为:");
        System.out.println(dis.getFacilitie(findFcName).printAll());
        //打印位置（目录）
        System.out.println(findFcName+"的地址为:");
        System.out.println(dis.getFacilitie(findFcName).printDirectory());
        System.out.println("----------------------------------------");
    }
}
