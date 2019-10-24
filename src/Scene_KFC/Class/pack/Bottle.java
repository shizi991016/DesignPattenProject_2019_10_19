package pack;

/*
 *瓶子类对包装接口的实现
 */

public class Bottle implements Packing{

    @Override
    public  String pack(){
        return "Bottle";
    }
}
