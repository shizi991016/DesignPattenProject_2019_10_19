package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class FilterPatternTest {
    public static void filterPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("3.过滤器模式(Filter Pattern)：");
        System.out.println("\n测试一:");
        System.out.println("Hotel调用printTypeRoomInfo函数");
        Hotel hotel = Hotel.getInstance();
        hotel.printTypeRoomInfo("SMALL");
        hotel.printTypeRoomInfo("MIDDLE");
        hotel.printTypeRoomInfo("LARGE");
        System.out.println("\n测试二:");
        System.out.println("Hotel调用printEmptyRoomInfo函数");
        hotel.printEmptyRoomInfo();
        System.out.println("\n测试三:");
        System.out.println("Hotel调用printTypeAndEmptyRoomInfo函数");
        hotel.printTypeRoomInfo("SMALL");
        hotel.printTypeRoomInfo("MIDDLE");
        hotel.printTypeRoomInfo("LARGE");
        System.out.println("----------------------------------------" + "\n");
    }
}
