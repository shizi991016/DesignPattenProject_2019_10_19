package Scene_InPark.Class.FlowerParade.Floats;

import Scene_InPark.Class.FlowerParade.Memento.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 花车游行类，内部由私有迭代器类，实现迭代器模式
 */
public class FloatParade {
    //花车名字
    private String[] names = {"米奇花车", "白雪公主花车", "小飞象花车", "玩具总动员花车"};

    //存储的花车序列
    private ArrayList<Floats> floats = new ArrayList<>();

    //花车游行类实例对象，单例
    private static FloatParade floatParade;

    //获得单例
    public static FloatParade getInstance() {
        if(floatParade == null) {
            floatParade = new FloatParade();
            //构建花车序列
            for (int i = 0; i < floatParade.names.length; i++) {
                floatParade.floats.add(new Floats(floatParade.names[i]));
            }
        }
        return floatParade;
    }

    //创建并获得当前状态备忘录
    public Memento createMemento() {
        return new Memento(this.floats);
    }

    //从备忘录中恢复状态
    public void reinstateMemento(Memento memento) {
        this.floats = memento.getOrderState();   
    }

    //反转当前花车顺序
    public void reverseOrder() {
        ArrayList<Floats> temp = new ArrayList<>();
        for (int i = this.floats.size() - 1; i >= 0; i--) {
            temp.add(this.floats.get(i));
        }
        this.floats = temp;
    }

    //随机打乱花车顺序
    public void randomOrder() {
        ArrayList<Floats> temp = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int num;
        int key = 0;
        while (map.size() != 4) {
            num = (int)((Math.random() * 4) % 4);
            if(!map.containsValue(num)) {
                map.put(key++, num);
            }
        }
        for (int i = 0; i < 4; i++) {
            temp.add(this.floats.get(map.get(i)));
        }
        this.floats = temp;
    }

    //还原最初花车顺序
    public void originalOrder() {
        ArrayList<Floats> temp = new ArrayList<>();
        for (int i = 0; i < this.names.length; i++) {
            temp.add(new Floats(names[i]));
        }
        this.floats = temp;
    }


    /**
     * 迭代器模式，私有类，实现对花车游行类的迭代器，getIterator()方法获得迭代器实例
     */
    public Iterator getIterator() {
        return new FloatParadeIterator();
    }

    private class FloatParadeIterator implements Iterator {
        private int index = 0;
        //接口实现，判断是否还有内容
        public boolean hasNext() {
            if(index < names.length) {
                return true;
            }
            return false;
        }
        //接口实现，获得内容
        public Object next() {
            if(hasNext()) {
                Floats theFloat = floats.get(index);
                index++;
                return theFloat;
            }
            return null;
        }
    }
}