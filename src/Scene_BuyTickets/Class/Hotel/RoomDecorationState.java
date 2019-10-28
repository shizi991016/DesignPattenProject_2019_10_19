package Scene_BuyTickets.Class.Hotel;

/*
 * 实现接口RoomState 三种状态的一种
 */
public class RoomDecorationState implements RoomState{
    public String printState(){
        return "装修";
    }
}
