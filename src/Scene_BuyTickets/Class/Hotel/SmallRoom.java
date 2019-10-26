package Scene_BuyTickets.Class.Hotel;
import java.util.*;

/*
 * 三种房间类型的一种，父类为Room
 */
public class SmallRoom extends Room{
    private static final int price = 300;

    SmallRoom(String _room_id){
        this.roomType = "SMALL";
        this.roomID = _room_id;
        this.roomState= new RoomEmptyState();
    }

    @Override
    public void setRoomState(RoomState _roomState){
        this.roomState = _roomState;
    }
}
