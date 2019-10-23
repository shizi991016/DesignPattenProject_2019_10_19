import java.util.ArrayList;
import java.util.HashMap;

public class FloatParade {
    private String[] names = {"MickeyMouseFloat", "SnowWhiteFloat", "DumboFloat", "ToyStoryFloat"};
    private ArrayList<Float> floats = new ArrayList<>();
    private static FloatParade floatParade;
    public static FloatParade getInstance() {
        if(floatParade == null) {
            floatParade = new FloatParade();
            for (int i = 0; i < floatParade.names.length; i++) {
                floatParade.floats.add(new Float(floatParade.names[i]));
            }
        }
        return floatParade;
    }
    public Memento createMemento() {
        return new Memento(this.floats);
    }
    public void reinstateMemento(Memento memento) {
        this.floats.clear();
        this.floats = memento.getOrderState();   
    }
    public void reverseOrder() {
        ArrayList<Float> temp = new ArrayList<>();
        for (int i = this.floats.size() - 1; i >= 0; i--) {
            temp.add(this.floats.get(i));
        }
        this.floats = temp;
    }
    public void randomOrder() {
        ArrayList<Float> temp = new ArrayList<>();
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
    public void originalOrder() {
        ArrayList<Float> temp = new ArrayList<>();
        for (int i = 0; i < this.names.length; i++) {
            temp.add(new Float(names[i]));
        }
        this.floats = temp;
    }

    public Iterator getIterator() {
        return new FloatParadeIterator();
    }
    private class FloatParadeIterator implements Iterator {
        private int index = 0;
        public boolean hasNext() {
            if(index < names.length) {
                return true;
            }
            return false;
        }
        public Object next() {
            if(hasNext()) {
                Float theFloat = floats.get(index);
                index++;
                return theFloat;
            }
            return null;
        }
    }
}