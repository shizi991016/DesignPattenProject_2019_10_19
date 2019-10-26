package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class EasyFactoryTest {
    public void EasyFactory(){
        System.out.println("****************************************************************************");
        System.out.println("模式二 简单工厂模式(Easy Factory)：");
        System.out.println("相关类：Hotel RoomFactory Room SmallRoom MiddleRoom LargeRoom NullRoom");
        System.out.println("模式二 测试一 控制器Hotel通过addNewRoom函数调用RoomFactory来生产SmallRoom");
        Hotel hotel = Hotel.getInstance();
        hotel.addNewRoom("201","SMALL");
        System.out.println("模式二 测试一 控制器Hotel通过addNewRoom函数调用RoomFactory来生产MiddleRoom");
        hotel.addNewRoom("202","MIDDLE");
        System.out.println("模式二 测试一 控制器Hotel通过addNewRoom函数调用RoomFactory来生产LargeRoom");
        hotel.addNewRoom("203","LARGE");
        System.out.println("*****************************************************************************");
    }
}
