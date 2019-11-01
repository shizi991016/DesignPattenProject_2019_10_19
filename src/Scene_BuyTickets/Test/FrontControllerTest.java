package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class FrontControllerTest {
    public static void frontControllerTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("1. 前端控制器模式(Front Controller)：");
        System.out.println("\n测试一:");
        System.out.println("Dispatcher分配HotelReceptionView");
        Hotel hotel = Hotel.getInstance();
        hotel.dispatchRequest("reception");
        System.out.println("\n测试二:");
        System.out.println("Dispatcher分配HotelManagementView");
        hotel.dispatchRequest("management");
        System.out.println("----------------------------------------" + "\n");
    }
}
