package Scene_BuyTickets.Class.Hotel;
import java.util.ArrayList;
import java.util.List;

/*
 * 过滤器模式中的和运算
 */
public class RoomAndCriteria implements RoomCriteria{
    private RoomCriteria criteria;
    private RoomCriteria otherCriteria;

    public RoomAndCriteria(RoomCriteria criteria, RoomCriteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Room> meetCriteria(List<Room> roomList) {
        List<Room> firstCriteriaPersons = criteria.meetCriteria(roomList);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
