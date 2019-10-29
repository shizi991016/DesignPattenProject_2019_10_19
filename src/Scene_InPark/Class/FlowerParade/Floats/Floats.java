package Scene_InPark.Class.FlowerParade.Floats;

import Scene_InPark.Class.FlowerParade.Memento.*;

/**
 * 花车类，存储花车的名字
 */
public class Floats {
    //花车名字
    private String name;

    //构造函数
    public Floats(String name) {
        this.name = name;
    }

    //获得花车名字
    public String getName() {
        return name;
    }
}