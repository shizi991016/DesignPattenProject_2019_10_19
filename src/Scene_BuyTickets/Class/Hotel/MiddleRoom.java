package Scene_BuyTickets.Class.Hotel;
import java.util.*;

/*
 * 三种房间类型的一种，父类为Room
 */
public class MiddleRoom extends Room{

    MiddleRoom(String _room_id){
        this.roomType = "MIDDLE";
        this.roomID = _room_id;
        this.roomState= new RoomEmptyState();
    }

    @Override
    public void setRoomState(RoomState _roomState){
        this.roomState = _roomState;
    }
}
