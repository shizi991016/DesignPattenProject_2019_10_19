package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Tourist;

public class VisitorPatternTest {
    public static void visitorPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("13.访问者模式(Visitor)：");
        //获取游乐园单例并初始化设施
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();
        //初始化游客
        Tourist visitorA = new Tourist("visitorA");
        Tourist visitorB = new Tourist("visitorB");
        System.out.println("\n"+"测试一：");
        System.out.println("visitorA调用visit函数改变设施的客流量\n" +
                "游乐园调用printFlow函数打印所有设施客流量");
        System.out.println("游客A的游览路线为：\nferrisWheel-->aquarium-->kfc");
        //调用visit函数来进行对设施客流量的修改
        visitorA.Visit(dis.getFacilitie("ferrisWheel"));
        visitorA.Visit(dis.getFacilitie("aquarium"));
        visitorA.Visit(dis.getFacilitie("kfc"));
        //打印园中所有设施客流量
        System.out.println("游客A游览后所有设施的客流量如下：");
        System.out.println(dis.getFacilitie("DreamIsland").printFlow());


        System.out.println("\n"+"测试二：");
        System.out.println("visitorB调用visit函数改变设施的客流量\n" +
                "游乐园调用printFlow函数打印所有设施客流量");
        System.out.println("游客B的游览路线为：\naquarium-->rollerCoaster-->kfc-->D");
        visitorB.Visit(dis.getFacilitie("aquarium"));
        visitorB.Visit(dis.getFacilitie("rollerCoaster"));
        visitorB.Visit(dis.getFacilitie("kfc"));
        visitorB.Visit(dis.getFacilitie("D"));
        System.out.println("游客B游览后所有设施的客流量如下：");
        System.out.println(dis.getFacilitie("DreamIsland").printFlow());
        System.out.println("----------------------------------------");
    }
}
