package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

import java.util.ArrayList;
import java.util.List;

public class StatePatternTest {
    public static void statePatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("5. 状态模式(State Pattern)：");
        System.out.println("\n测试一:");
        System.out.println("控制器Hotel调用changeRoomState函数");
        Hotel hotel = Hotel.getInstance();
        RoomState room_state = new RoomDecorationState();
        hotel.changeRoomState("102",room_state);
        System.out.println("\n测试二:");
        System.out.println("不同状态对liveIn函数相应方式不同");
        List<String> tourist_name = new ArrayList<String>();
        List<String> tourist_id = new ArrayList<String>();
        tourist_name.add("张三");
        tourist_id.add("213123213");
        hotel.lineIn(1,tourist_name,tourist_id,"102");
        hotel.lineIn(1,tourist_name,tourist_id,"101");
        System.out.println("----------------------------------------" + "\n");
    }
}
