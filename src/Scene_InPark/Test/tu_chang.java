package Scene_InPark.Test;


import Scene_InPark.Class.Facilitie.Area;
import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;

public class tu_chang {
    public static void main(String[] args){
        Facilitie dreamIsland =new Area("DreamIsland");
        DreamIsland dis=DreamIsland.getInstance();


        Facilitie areaA = dis.getFacilitie("A",2);

        Facilitie areaB = dis.getFacilitie("B",2);
        Facilitie areaC = dis.getFacilitie("C",2);
        Facilitie areaD = dis.getFacilitie("D",2);

        Facilitie rollerCoaster = dis.getFacilitie("rollerCoaster",1);
        Facilitie ferrisWheel = dis.getFacilitie("ferrisWheel",1);
        Facilitie KFC = dis.getFacilitie("kfc",1);
        Facilitie merryGoAround = dis.getFacilitie("merryGoAround",1);
        Facilitie aquarium = dis.getFacilitie("aquarium",1);

        dreamIsland.addChild(areaA);
        dreamIsland.addChild(areaB);
        dreamIsland.addChild(areaC);
        areaA.addChild(ferrisWheel);
        areaA.addChild(merryGoAround);
        areaA.addChild(aquarium);
        areaB.addChild(rollerCoaster);
        areaC.addChild(KFC);

        System.out.println("全体设施结构为：");
        System.out.println(dreamIsland.printAll());
        System.out.println("过山车的地址为：");
        System.out.println(rollerCoaster.printDirectory());
    }
}
