package Scene_BuyTickets.Class.Hotel;
import java.util.*;

/*
 * 抽象类 描述宾馆中的房间
 */
public abstract class Room {
    protected String roomID;
    protected String roomType;
    protected RoomState roomState;
    private int touristNumber;
    private List<String> touristName = new ArrayList<String>();
    private List<String> touristId = new ArrayList<String>();

    Room(){
        this.touristNumber = 0;
        this.touristName = new ArrayList<String>();;
        this.touristId = new ArrayList<String>();
    }

    public String getRoomID(){
        return this.roomID;
    }

    public String getRoomType(){return this.roomType;}

    public RoomState getRoomState(){return this.roomState;}

    public int getTouristNumber(){
        return this.touristNumber;
    }

    public void printAllInfo(){
        this.printPartInfo();
        if (roomState.printState().equals("入住")) {
            System.out.println("  房间入住人数:" + touristNumber);
            for(int i=0;i<touristName.size();i++){
                System.out.print("  旅客" + (i+1) + "姓名:" + touristName.get(i));
                System.out.print("  旅客" + (i+1) + "身份证号:" + touristId.get(i));
            }
            System.out.println(" ");
        }
    }

    public void printPartInfo(){
        System.out.print("房间号:" + roomID);
        System.out.print("  房间类型:" + roomType);
        System.out.println("  房间状态:" + roomState.printState());
    }

    public void lineIn(int _tourist_number,List<String> _tourist_name,List<String> _tourist_id){
        this.touristId = _tourist_id;
        this.touristName = _tourist_name;
        this.touristNumber = _tourist_number;
        this.roomState = new RoomInState();
    }

    public void liveOut(){
        this.touristNumber = 0;
        this.touristName = new ArrayList<String>();
        this.touristId = new ArrayList<String>();
        this.roomState = new RoomEmptyState();
    }

    public void setRoomState(RoomState _room_state){ }
}
