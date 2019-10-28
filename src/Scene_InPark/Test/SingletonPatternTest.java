package Scene_InPark.Test;

import Scene_InPark.Class.Facilitie.DreamIsland;
import Scene_InPark.Class.Facilitie.Facilitie;
import java.util.Scanner;
public class SingletonPatternTest {
    public static void singletonPatternTest(){
        //初始化区域和设施
        DreamIsland dis=DreamIsland.getInstance();
        DreamIsland.init();
    }
}
