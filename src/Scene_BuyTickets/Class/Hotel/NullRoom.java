package Scene_BuyTickets.Class.Hotel;

public class NullRoom extends Room{

    @Override
    public void printAllInfo(){
        System.out.println("不存在符合条件的房间");
    }

    @Override
    public void printPartInfo(){
        System.out.println("不存在符合条件的房间");
    }
}
