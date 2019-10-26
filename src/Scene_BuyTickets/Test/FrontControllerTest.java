package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class FrontControllerTest {
    public void FrontController(){
        System.out.println("****************************************************************************");
        System.out.println("模式一 前端控制器模式(Front Controller)：");
        System.out.println("相关类：Hotel HotelManagementView HotelReceptionView HotelDispatcher");
        System.out.println("模式一 测试一 由控制器Hotel调用Dispatcher分配到HotelReceptionView");
        Hotel hotel = Hotel.getInstance();
        hotel.dispatchRequest("reception");
        System.out.println("模式一 测试二 由控制器Hotel调用Dispatcher分配到HotelManagementView");
        hotel.dispatchRequest("management");
        System.out.println("*****************************************************************************");
    }
}
