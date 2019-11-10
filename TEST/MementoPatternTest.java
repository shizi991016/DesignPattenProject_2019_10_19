package Test;

import java.util.Calendar;

import HotelScene.RoomClass;
import HotelScene.Memento.*;

/**
 * Memento模式测试类
 */
public class MementoPatternTest {
    public static void mementoPatternTest() {
        //产生备忘录
        Memento memento = new Memento();
        //准备工作
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(2018,11,8);
        calendar2.set(2018,11,10);
        //构建并存储预定信息
        ReservationInformation reInfo1 =new ReservationInformation();
        ReservationInformation reInfo2 =new ReservationInformation();
        reInfo1.ReservationInformation("Tan", 5, calendar1, calendar2, 501, 
                                RoomClass.SignatureSuites, 1000, memento.roomList);
        reInfo2.ReservationInformation("HE", 3, calendar1, calendar2, 204, 
                                RoomClass.ClubLevelRooms, 1050, memento.roomList);
        reInfo1.modifyReservation("Lv", 3, 2019, 5, 5, 2019, 5, 7, 105, RoomClass.ClubLevelRooms, 10054, true);
        //展示
        memento.showList();
    }
}