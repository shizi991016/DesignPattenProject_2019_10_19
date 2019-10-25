package Class.pack;

/*
 *瓶子类对包装接口的实现
 */

public class Bottle implements pack.Packing {

    @Override
    public  String pack(){
        return "Bottle";
    }
}
