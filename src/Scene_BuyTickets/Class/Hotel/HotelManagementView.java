package Scene_BuyTickets.Class.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 宾馆管理视图，由分配器调度
 */
public class HotelManagementView {
    public void show(){
        Hotel hotel = Hotel.getInstance();
        System.out.println("==================================================================");
        System.out.println("=========================欢迎使用酒店管理系统=======================");
        System.out.println("=========================1 打印所有房间信息=========================");
        System.out.println("=========================2 查询某一类型房间=========================");
        System.out.println("=========================3 查询所有空闲房间=========================");
        System.out.println("=========================4 查询指定类型空闲房间=====================");
        System.out.println("=========================5 查询某一具体房间信息=====================");
        System.out.println("=========================6 办理入住================================");
        System.out.println("=========================7 办理退房================================");
        System.out.println("=========================8 更改房间状态信息 =======================");
        System.out.println("=========================9 增加房间===============================");
        System.out.println("=========================10 删除房间==============================");
        System.out.println("=========================0 退出===================================");
        System.out.println("==================================================================");
        System.out.print("请输入您要使用的业务序号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(true){
            switch(num){
                case 0: //退出
                    return;
                case 1: //打印所有房间信息
                    hotel.printAllRoomInfo();
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 2: //查询某一类型房间
                    System.out.print("请输入房间类型,不区分大小写[SMALL MIDDLE LARGE]：");
                    String type = sc.next();
                    if(type.equalsIgnoreCase("SMALL")||type.equalsIgnoreCase("MIDDLE")||type.equalsIgnoreCase("LARGE")){
                        hotel.printTypeRoomInfo(type);
                    }
                    else{
                        System.out.println("输入有误！");
                    }
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 3: //查询所有空闲房间
                    hotel.printEmptyRoomInfo();
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 4: //查询指定类型空闲房间
                    System.out.print("请输入房间类型,不区分大小写[SMALL MIDDLE LARGE]：");
                    String type2 = sc.next();
                    if(type2.equalsIgnoreCase("SMALL")||type2.equalsIgnoreCase("MIDDLE")||type2.equalsIgnoreCase("LARGE")){
                        hotel.printTypeAndEmptyRoomInfo(type2);
                    }
                    else{
                        System.out.println("输入有误！");
                    }
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 5: //查询某一具体房间信息
                    System.out.print("请输入要查询的房间号：");
                    String room_id2 = sc.next();
                    hotel.printRoomInfo(room_id2);
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 6: //办理入住
                    System.out.print("请输入要入住的房间号：");
                    String _room_id = sc.next();
                    System.out.print("请输入要入住的人数：");
                    int _tourist_number = sc.nextInt();
                    List<String> _tourist_name = new ArrayList<String>();
                    List<String> _tourist_id = new ArrayList<String>();
                    for(int i=0;i<_tourist_number;i++){
                        System.out.print("请输入旅客"+(i+1)+"的姓名：");
                        _tourist_name.add(sc.next());
                        System.out.print("请输入旅客"+(i+1)+"的身份证号：");
                        _tourist_id.add(sc.next());
                    }
                    hotel.lineIn(_tourist_number,_tourist_name,_tourist_id,_room_id);
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 7: //办理退房
                    System.out.print("请输入要退房的房间号：");
                    String room_id = sc.next();
                    hotel.liveOut(room_id);
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 8: //更改房间状态信息
                    System.out.print("请输入要变更状态的房间号：");
                    String room_id5 = sc.next();
                    System.out.print("请输入变更后的房间状态 [1空闲 2装修]：");
                    int state = sc.nextInt();
                    RoomState room_state;
                    if(state==1){
                        room_state = new RoomEmptyState();
                        hotel.changeRoomState(room_id5,room_state);
                    }else if(state==2){
                        room_state = new RoomDecorationState();
                        hotel.changeRoomState(room_id5,room_state);
                    }else{
                        System.out.println("输入有误！");
                    }
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 9: //增加房间
                    System.out.print("请输入新增的房间号：");
                    String room_id4 = sc.next();
                    System.out.print("请输入新增的房间类型,不区分大小写[SMALL MIDDLE LARGE]：");
                    String type4 = sc.next();
                    if(type4.equalsIgnoreCase("SMALL")||type4.equalsIgnoreCase("MIDDLE")||type4.equalsIgnoreCase("LARGE")){
                        hotel.addNewRoom(room_id4,type4);
                    }
                    else{
                        System.out.println("输入有误！");
                    }
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                case 10: //删除房间
                    System.out.print("请输入要删除的房间号：");
                    String room_id3 = sc.next();
                    hotel.deleteRoom(room_id3);
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
                default: //输入错误
                    System.out.println("输入有误，请重新输入!");
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.nextInt();
                    break;
            }
        }
    }
}
