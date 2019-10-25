package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

import java.util.ArrayList;
import java.util.List;

public class HotelTest {

    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance();
        hotel.printAllRoomInfo();
        hotel.printRoomInfo("104");
        hotel.printRoomInfo("107");
        RoomState room_state = new RoomDecorationState();
        hotel.changeRoomState("102", room_state);
        List<String> tourist_name = new ArrayList<String>();
        List<String> tourist_id = new ArrayList<String>();
        tourist_name.add("张三");
        tourist_name.add("李四");
        tourist_id.add("565656");
        tourist_id.add("2546h");
        hotel.lineIn(2, tourist_name, tourist_id, "101");
        hotel.liveOut("102");
        hotel.liveOut("101");
        hotel.liveOut("201");
        hotel.addNewRoom("101", "LARGE");
        hotel.addNewRoom("201", "LARGE");
        hotel.lineIn(2, tourist_name, tourist_id, "201");
        hotel.printAllRoomInfo();
        hotel.deleteRoom("201");
        hotel.deleteRoom("101");
        hotel.printEmptyRoomInfo();
        hotel.printTypeRoomInfo("LARGE");
        hotel.printTypeAndEmptyRoomInfo("LARGE");
    }
}
