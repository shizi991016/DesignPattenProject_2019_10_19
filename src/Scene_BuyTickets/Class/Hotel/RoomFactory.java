package Scene_BuyTickets.Class.Hotel;

/*
 * 房间生产工厂 由Hotel类中的addNewRoom函数调用
 */
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
