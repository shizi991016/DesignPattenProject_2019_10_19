package Scene_InPark.Test;


import Scene_InPark.Class.Facilitie.*;

import java.util.Scanner;

public class tu_chang {
    public static void main(String[] args){
        //初始化区域和设施
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();
        //新建设施
        System.out.println("\n"+"请输入您要创建的新设施或区域名称：");
        Scanner sc = new Scanner(System.in);
        String mName=sc.next();
        System.out.println("\n"+"请输入您要创建的新设施的类型（1为设施，2为区域）：");
        int mType = sc.nextInt();
        Facilitie mfc=dis.getFacilitie(mName,mType);
        System.out.println("\n"+"请输入您要创建的新设施所在的区域名：");
        String parentArea=sc.next();
        dis.getFacilitie(parentArea).addChild(mfc);
        System.out.println("\n"+"当前游乐园设施结构为：");
        System.out.println(dis.getFacilitie("DreamIsland").printAll());
        //查询设施
        System.out.println("\n"+"请输入您要查询的设施名：");
        String findName=sc.next();
        if(dis.getFacilitie(findName)!=null){
        System.out.println(findName+"的包含设施和区域为:");
        System.out.println(dis.getFacilitie(findName).printAll());
        System.out.println(findName+"的地址为:");
        System.out.println(dis.getFacilitie(findName).printDirectory());
        }
    }
}
