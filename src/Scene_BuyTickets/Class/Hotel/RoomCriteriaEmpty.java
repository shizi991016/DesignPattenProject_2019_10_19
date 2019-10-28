package Scene_BuyTickets.Class.Hotel;

import java.util.ArrayList;
import java.util.List;

/*
 * 过滤器模式中的空房间过滤器 实现接口RoomCriteria
 */
public class RoomCriteriaEmpty implements RoomCriteria{
    @Override
    public List<Room> meetCriteria(List<Room> roomList){
        List<Room> newRoomList = new ArrayList<Room>();
        for(Room room : roomList){
            if(room.getRoomState().printState().equals("空闲")){
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
