package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class EasyFactoryTest {
    public static void easyFactoryTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("2. 简单工厂模式(Easy Factory)：");
        System.out.println("\n测试一:");
        System.out.println("Hotel调用addNewRoom函数生产SmallRoom");
        Hotel hotel = Hotel.getInstance();
        hotel.addNewRoom("201","SMALL");
        System.out.println("\n测试二:");
        System.out.println("Hotel调用addNewRoom函数生产MiddleRoom");
        hotel.addNewRoom("202","MIDDLE");
        System.out.println("\n测试三:");
        System.out.println("Hotel调用addNewRoom函数生产LargeRoom");
        hotel.addNewRoom("203","LARGE");
        System.out.println("----------------------------------------" + "\n");
    }
}
