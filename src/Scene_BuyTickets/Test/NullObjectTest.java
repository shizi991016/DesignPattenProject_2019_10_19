package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class NullObjectTest {
    public void NullObject(){
        System.out.println("****************************************************************************");
        System.out.println("模式四 空对象模式(Null Object)：");
        System.out.println("相关类：Hotel Room NullRoom");
        System.out.println("模式四 测试 控制器Hotel调用printRoomInfo函数输出指定房间号的房间信息，若未查询到，则返回空对象并输出空对象中的预定输出信息");
        Hotel hotel = Hotel.getInstance();
        hotel.printRoomInfo("855");
        System.out.println("*****************************************************************************");
    }
}
