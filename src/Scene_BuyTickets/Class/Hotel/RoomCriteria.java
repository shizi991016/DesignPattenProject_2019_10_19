package Scene_BuyTickets.Class.Hotel;
import java.util.List;

/*
 * 过滤器模式接口类
 */
public interface RoomCriteria {
    public List<Room> meetCriteria(List<Room> roomList);
}
