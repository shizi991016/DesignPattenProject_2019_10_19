package Scene_BuyTickets.Class.Hotel;

public class RoomFactory {
    public Room createRoom(String _roomType,String _room_id){
        if(_roomType == null){
            return new NullRoom();
        }
        if(_roomType.equalsIgnoreCase("SMALL")){
            return new SmallRoom(_room_id);
        }
        if(_roomType.equalsIgnoreCase("MIDDLE")){
            return new MiddleRoom(_room_id);
        }
        if(_roomType.equalsIgnoreCase("LARGE")){
            return new LargeRoom(_room_id);
        }
        return new NullRoom();
    }
}
