package Scene_BuyTickets.Class.Hotel;

/*
 * 分配器，用与在前端控制器模式中指定具体视图
 */

public class HotelViewDispatcher {
    private HotelReceptionView receptionView;
    private HotelManagementView managementView;

    //构造函数
    public HotelViewDispatcher(){
        receptionView = new HotelReceptionView();
        managementView = new HotelManagementView();
    }

    //分配器
    public void dispatch(String request){
        if(request.equalsIgnoreCase("management")){
            managementView.show();
        }else{
            receptionView.show();
        }
    }
}
