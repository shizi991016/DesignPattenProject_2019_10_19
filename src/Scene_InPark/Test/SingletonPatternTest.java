package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;
import java.util.Scanner;
public class SingletonPatternTest {
    public static void main(String[] args){
        //初始化区域和设施
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();

//        //查询设施
//        System.out.println("\n"+"请输入您要查询的设施名：");
//        String findName=sc.next();
//        if(dis.getFacilitie(findName)!=null){
//            System.out.println(findName+"的包含设施和区域为:");
//            System.out.println(dis.getFacilitie(findName).printAll());
//            System.out.println(findName+"的地址为:");
//            System.out.println(dis.getFacilitie(findName).printDirectory());
//        }
    }
}
