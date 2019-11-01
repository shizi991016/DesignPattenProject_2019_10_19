package Scene_BuyTickets.Class.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 宾馆前台视图，由分配器调度
 */
public class HotelReceptionView {
    public void show(){
        Hotel hotel = Hotel.getInstance();
        System.out.println("欢迎使用酒店前台登记系统");
        System.out.println("1 查询所有空闲房间");
        System.out.println("2 查询指定类型空闲房间");
        System.out.println("3 办理入住");
        System.out.println("4 办理退房");
        System.out.println("0 退出系统");
        System.out.print("请输入您要使用的业务序号：");
        Scanner sc = new Scanner(System.in);
        String num = num = sc.next();
        while(true){
            switch(num){
                case "0": //退出
                    return;
                case "1": //查询所有空闲房间
                    hotel.printEmptyRoomInfo();
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.next();
                    break;
                case "2": //查询指定类型空闲房间
                    System.out.print("请输入房间类型,不区分大小写[SMALL MIDDLE LARGE]：");
                    String type = sc.next();
                    if(type.equalsIgnoreCase("SMALL")||type.equalsIgnoreCase("MIDDLE")||type.equalsIgnoreCase("LARGE")){
                        hotel.printTypeAndEmptyRoomInfo(type);
                    }
                    else{
                        System.out.println("输入有误！");
                    }
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.next();
                    break;
                case "3": //办理入住
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
                    num = sc.next();
                    break;
                case "4": //办理退房
                    System.out.print("请输入要退房的房间号：");
                    String room_id = sc.next();
                    hotel.liveOut(room_id);
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.next();
                    break;
                default:
                    System.out.println("输入有误，请重新输入!");
                    System.out.print("请输入您要使用的业务序号：");
                    num = sc.next();
                    break;
            }
        }
    }
}
