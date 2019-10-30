package Scene_BuyTickets.Class.Hotel;
import java.util.*;

/*
 * 宾馆类
 * 相当于MVC模式下的控制器，所有与数据和视图相关的操作都封装在此类中
 */
public class Hotel {
    // 创建唯一的Hotel对象
    private static Hotel hotel = new Hotel();
    // 房间列表
    private static List<Room> roomList = new ArrayList<Room>();
    // 前端控制器中的调度器
    private static HotelViewDispatcher dispatcher = new HotelViewDispatcher();

    // 房间生产工厂
    private static RoomFactory roomFactory = new RoomFactory();

    //类型过滤器
    private static RoomCriteria roomCriteriaEmpty = new RoomCriteriaEmpty();
    private static RoomCriteria roomCriteriaSmall = new RoomCriteriaSmall();
    private static RoomCriteria roomCriteriaMiddle = new RoomCriteriaMiddle();
    private static RoomCriteria roomCriteriaLarge = new RoomCriteriaLarge();

    // 生产5个房间实例加入到房间列表中
    static{
        Room room1 = roomFactory.createRoom("SMALL","101");
        Room room2 = roomFactory.createRoom("SMALL","102");
        Room room3 = roomFactory.createRoom("MIDDLE","103");
        Room room4 = roomFactory.createRoom("MIDDLE","104");
        Room room5 = roomFactory.createRoom("LARGE","105");
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
    }

    // 构造函数为private 以保证Hotel类不会被实例化
    private Hotel(){}
    // 获取唯一可用对象
    public static Hotel getInstance(){
        return hotel;
    }

    public void dispatchRequest(String request){
        dispatcher.dispatch(request);
    }

    // 打印所有房间信息
    public void printAllRoomInfo(){
        System.out.println("宾馆所有房间信息如下:");
        for(int i=0;i<roomList.size();i++){
            roomList.get(i).printAllInfo();
        }
    }

    //查询某一类型房间
    public void printTypeRoomInfo(String _type){
        System.out.println("类型为"+_type+"的房间信息如下:");
        List<Room> newRoomList = new ArrayList<Room>();;
        if(_type.equalsIgnoreCase("SMALL")){
            newRoomList = roomCriteriaSmall.meetCriteria(roomList);
        }
        else if(_type.equalsIgnoreCase("MIDDLE")){
            newRoomList = roomCriteriaMiddle.meetCriteria(roomList);
        }
        else if(_type.equalsIgnoreCase("LARGE")){
            newRoomList = roomCriteriaLarge.meetCriteria(roomList);
        }
        for(Room room:newRoomList){
            room.printPartInfo();
        }
    }

    // 查询空闲房间
    public void printEmptyRoomInfo(){
        System.out.println("所有空闲房间信息如下:");
        List<Room> newRoomList = roomCriteriaEmpty.meetCriteria(roomList);
        for(Room room:newRoomList){
            room.printPartInfo();
        }
    }

    // 查询某一类型的空闲房间
    public void printTypeAndEmptyRoomInfo(String _type){
        System.out.println("类型为"+_type+"的空闲房间信息如下:");
        RoomCriteria roomCriteria;
        List<Room> newRoomList = new ArrayList<Room>();;
        if(_type.equalsIgnoreCase("SMALL")){
            roomCriteria = new RoomAndCriteria(roomCriteriaSmall,roomCriteriaEmpty);
            newRoomList = roomCriteria.meetCriteria(roomList);
        }
        else if(_type.equalsIgnoreCase("MIDDLE")){
            roomCriteria = new RoomAndCriteria(roomCriteriaMiddle,roomCriteriaEmpty);
            newRoomList = roomCriteria.meetCriteria(roomList);
        }
        else if(_type.equalsIgnoreCase("LARGE")){
            roomCriteria = new RoomAndCriteria(roomCriteriaLarge,roomCriteriaEmpty);
            newRoomList = roomCriteria.meetCriteria(roomList);
        }
        for(Room room:newRoomList){
            room.printPartInfo();
        }
    }

    // 查询某一具体房间
    public void printRoomInfo(String _room_id){
        System.out.println("房间"+_room_id+"信息:");
        for(int i=0;i<roomList.size();i++){
            if(roomList.get(i).getRoomID().equals(_room_id)){
                roomList.get(i).printAllInfo();
                return;
            }
        }
        Room nullRoom = roomFactory.createRoom(null,null);
        nullRoom.printAllInfo();
    }

    // 根据游客信息及房间号办理入住
    public void lineIn(int _tourist_number,List<String> _tourist_name,List<String> _tourist_id,String _room_id){
        if(_tourist_number!=_tourist_id.size() || _tourist_number!=_tourist_name.size()){
            System.out.println("入住失败，输入的旅客姓名数或身份证数与旅客实际人数不匹配");
            return;
        }
        for(int i=0;i<roomList.size();i++){
            if(roomList.get(i).getRoomID().equals(_room_id)&&roomList.get(i).getRoomState().printState().equals("空闲")){
                roomList.get(i).lineIn(_tourist_number,_tourist_name,_tourist_id);
                System.out.println("入住成功，入住后的"+_room_id+"房间信息为:");
                roomList.get(i).printAllInfo();
                return;
            }
        }
        Room nullRoom = roomFactory.createRoom(null,null);
        nullRoom.printAllInfo();
    }

    // 根据房间号退房
    public void liveOut(String _room_id){
        for(int i=0;i<roomList.size();i++){
            if(roomList.get(i).getRoomID().equals(_room_id)){
                if(roomList.get(i).getTouristNumber()!=0){
                    roomList.get(i).liveOut();
                    System.out.println("退房成功，退房后的"+_room_id+"房间信息为:");
                    roomList.get(i).printAllInfo();
                    return;
                }
                else{
                    System.out.println("退房失败，该房间无人入住！");
                    return;
                }
            }
        }
        System.out.println("退房失败，");
        Room nullRoom = roomFactory.createRoom(null,null);
        nullRoom.printAllInfo();
    }

    // 更改某一房间状态信息
    public void changeRoomState(String _room_id,RoomState _room_state){
        for(int i=0;i<roomList.size();i++){
            if(roomList.get(i).getRoomID().equals(_room_id)&&roomList.get(i).getTouristNumber()==0){
                roomList.get(i).setRoomState(_room_state);
                System.out.println("更改成功，更改后的"+_room_id+"房间信息为:");
                roomList.get(i).printAllInfo();
                return;
            }
        }
        Room nullRoom = roomFactory.createRoom(null,null);
        nullRoom.printAllInfo();
    }

    // 增加房间
    public void addNewRoom(String _room_id,String _room_type){
        for(int i=0;i<roomList.size();i++){
            if(roomList.get(i).getRoomID().equals(_room_id)){
                System.out.println("添加失败！该房间号已存在");
                return;
            }
        }
        Room _room = roomFactory.createRoom(_room_type,_room_id);
        roomList.add(_room);
        System.out.println("添加成功，添加的房间信息为：");
        _room.printPartInfo();
    }

    // 删除房间
    public void deleteRoom(String _room_id){
        for(int i=0;i<roomList.size();i++){
            if(roomList.get(i).getRoomID().equals(_room_id)){
                if(roomList.get(i).getTouristNumber()==0){
                    roomList.remove(i);
                    System.out.println("删除成功！目前所有房间信息为:");
                    this.printAllRoomInfo();
                    return;
                }
                else{
                    System.out.println("删除失败，该房间还有人入住！");
                    return;
                }
            }
        }
        System.out.print("删除失败，");
        Room nullRoom = roomFactory.createRoom(null,null);
        nullRoom.printAllInfo();
    }

}
