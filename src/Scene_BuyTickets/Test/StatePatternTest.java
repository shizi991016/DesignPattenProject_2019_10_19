package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

import java.util.ArrayList;
import java.util.List;

public class StatePatternTest {
    public void StatePattern(){
        System.out.println("****************************************************************************");
        System.out.println("模式五 状态模式(State Pattern)：");
        System.out.println("相关类：Hotel Room RoomState RoomEmptyState RoomInState RoomDecorationState");
<<<<<<< HEAD
        System.out.println("模式五 测试一 控制器Hotel调用changeRoomState函数更改房间状态信息RoomEmptyState->RoomDecorationState");
        Hotel hotel = Hotel.getInstance();
        RoomState room_state = new RoomDecorationState();
        hotel.changeRoomState("102",room_state);
        System.out.println("模式五 测试二 不同状态会对应不同效果 如处于RoomDecorationState或RoomInState的房间不能入住 处于RoomEmptyState的房间则可以入住");
=======
        System.out.println("模式四 测试一 控制器Hotel调用changeRoomState函数更改房间状态信息RoomEmptyState->RoomDecorationState");
        Hotel hotel = Hotel.getInstance();
        RoomState room_state = new RoomDecorationState();
        hotel.changeRoomState("102",room_state);
        System.out.println("模式四 测试二 不同状态会对应不同效果 如处于RoomDecorationState或RoomInState的房间不能入住 处于RoomEmptyState的房间则可以入住");
>>>>>>> parent of 81db854... Merge branch 'master' of https://github.com/shizi991016/DesignPattenProject_2019_10_19
        List<String> tourist_name = new ArrayList<String>();
        List<String> tourist_id = new ArrayList<String>();
        tourist_name.add("张三");
        tourist_id.add("213123213");
        hotel.lineIn(1,tourist_name,tourist_id,"102");
        hotel.lineIn(1,tourist_name,tourist_id,"101");
        System.out.println("*****************************************************************************");
    }
}
