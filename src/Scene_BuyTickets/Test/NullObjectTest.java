package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class NullObjectTest {
    public static void nullObjectTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("4.空对象模式(Null Object)：");
        System.out.println("\n测试一:");
        System.out.println("控制器Hotel调用printRoomInfo");
        Hotel hotel = Hotel.getInstance();
        hotel.printRoomInfo("855");
        System.out.println("----------------------------------------" + "\n");
    }
}
