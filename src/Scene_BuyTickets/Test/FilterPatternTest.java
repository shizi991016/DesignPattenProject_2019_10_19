package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class FilterPatternTest {
    public void FilterPattern(){
        System.out.println("****************************************************************************");
        System.out.println("模式三 过滤器模式(Fliter Pattern)：");
        System.out.println("相关类：Hotel RoomCriteria RoomCriteriaEmpty RoomCriteriaSmall RoomCriteriaLarge RoomCriteriaMiddle RoomAndCriteria");
        System.out.println("模式三 测试一 控制器Hotel通过printTypeRoomInfo函数来输出类型(SMALL/MIDDLE/LARGE)的房间信息");
        Hotel hotel = Hotel.getInstance();
        hotel.printTypeRoomInfo("SMALL");
        hotel.printTypeRoomInfo("MIDDLE");
        hotel.printTypeRoomInfo("LARGE");
        System.out.println("模式三 测试二 控制器Hotel通过printEmptyRoomInfo函数来输出空闲房间信息");
        hotel.printEmptyRoomInfo();
        System.out.println("模式三 测试三 控制器Hotel通过printTypeAndEmptyRoomInfo函数输出指定类型且为空闲的房间信息");
        hotel.printTypeRoomInfo("SMALL");
        hotel.printTypeRoomInfo("MIDDLE");
        hotel.printTypeRoomInfo("LARGE");
        System.out.println("*****************************************************************************");
    }
}
