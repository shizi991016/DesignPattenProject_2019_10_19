package Scene_BuyTickets.Class.Hotel;

import java.util.ArrayList;
import java.util.List;

public class RoomCriteriaMiddle implements RoomCriteria{
    @Override
    public List<Room> meetCriteria(List<Room> roomList){
        List<Room> newRoomList  = new ArrayList<Room>();
        for(Room room : roomList){
            if(room.getRoomType().equalsIgnoreCase("MIDDLE")){
                newRoomList.add(room);
            }
        }
        if(newRoomList.size()==0){
            Room nullRoom = new NullRoom();
            newRoomList.add(nullRoom);
        }
        return newRoomList ;
    }
}