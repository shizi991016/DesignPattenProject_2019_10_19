package Scene_BuyTickets.Class.Hotel;
import java.util.*;

public class MiddleRoom extends Room{
    private static final int price = 300;

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
