package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Tourist;

public class VisitorPatternTest {
    public static void visitorPatternTest(){
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();

        Tourist visitorA = new Tourist("visitorA");
        Tourist visitorB = new Tourist("visitorB");
        System.out.println("游客A的游览路线为：ferrisWheel-->aquarium-->kfc");
        System.out.println("游客B的游览路线为：aquarium-->rollerCoaster-->kfc-->D");
        visitorA.Visit(dis.getFacilitie("ferrisWheel"));
        visitorA.Visit(dis.getFacilitie("aquarium"));
        visitorA.Visit(dis.getFacilitie("kfc"));
        visitorB.Visit(dis.getFacilitie("aquarium"));
        visitorB.Visit(dis.getFacilitie("rollerCoaster"));
        visitorB.Visit(dis.getFacilitie("kfc"));
        visitorB.Visit(dis.getFacilitie("D"));
        System.out.println("游客游览后所有设施的客流量如下：");
        System.out.println(dis.getFacilitie("DreamIsland").printFlow());

    }
}
