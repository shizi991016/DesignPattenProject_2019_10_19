package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;

import java.util.Scanner;

public class FlyweightPatternTest {

    public static void main(String[] args){
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();
        //新建区域
        System.out.println("\n"+"请输入您要创建的新区域名称：");
        Scanner sc = new Scanner(System.in);
        String areaName=sc.next();
        Facilitie mArea=dis.getFacilitie(areaName,2);
        System.out.println("\n"+"请输入您要创建的新区域所在的区域名：");
        String areaParentArea=sc.next();
        dis.getFacilitie(areaParentArea).addChild(mArea);
        System.out.println("\n"+"当前游乐园结构为：");
        System.out.println(dis.getFacilitie("DreamIsland").printAll());
    }
}
