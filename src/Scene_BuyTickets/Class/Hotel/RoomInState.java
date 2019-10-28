package Scene_BuyTickets.Class.Hotel;

/*
 * 实现接口RoomState 三种状态的一种
 */
public class RoomInState implements RoomState{
    public String printState(){
        return "入住";
    }
}
