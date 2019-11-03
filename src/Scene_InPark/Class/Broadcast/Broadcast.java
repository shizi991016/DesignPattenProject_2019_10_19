package Scene_InPark.Class.Broadcast;

import java.util.ArrayList;
import Scene_InPark.Class.Facilitie.Tourist;

//广播类，接收游客寻人寻物委托（中介者模式），广播闭园通知（观察者模式），切换闭园语言（适配器模式）
public class Broadcast {

    //使用ArrayList存放接收广播的游客名单
    private ArrayList<Tourist> noticeList
            = new ArrayList<>();

    //将游园状态设置为开放
    private boolean gardenState = true;

    //注册：将游客放进接收广播的游客名单里
    public void addList (Tourist tourist) {
        noticeList.add(tourist);
    }

    //将游园置为state，并判断是否需要通知游客闭园
    public void changeGardenState (boolean state){

        //将游园状态改变为参数state
        gardenState = state;

        //判断是否游园即将关闭，关闭则通知所有在名单中的游客
        if (!gardenState){
            System.out.println("游园状态改变置为闭园");
            System.out.println("changeGardenState(boolean)调用notifyAllTourists()通知所有游客");
            notifyAllTourists();
        }
        else{
            System.out.println("游园并未改变，仍为开放中");
        }
    }

    //使用适配器切换语言后，将游园置为state，并判断是否需要通知游客闭园
    public void changeGardenState (boolean state, Adapter adapter){

        //将游园状态改变为参数state
        gardenState = state;

        //判断是否游园即将关闭，关闭则通知所有在名单中的游客
        if (!gardenState){
            String message = null;

            //如果输出错误则循环
            while(true){
                //使用适配器切换语言
                message = adapter.translate();
                if(message.equals("false")){}
                else break;
            }

            System.out.println("游园状态置为闭园");

            System.out.println("changeGardenState(boolean,Adapter)调用notifyAllTourists(String)通知所有游客");
            //使用切换后的语言通知所有游客
            notifyAllTourists(message);

        }
        else{
            System.out.println("游园并未改变，仍为开放中");
        }
    }

    //通知所有在名单中的游客游园即将关闭
    private void notifyAllTourists(){

        System.out.println("广播：游园即将关闭，请各位游客尽快出园");

        System.out.println("notifyAllTourists()调用Tourists中changeBehavior()使得游客行为更新");
        for (int i = 0; i < noticeList.size(); i++) {
            noticeList.get(i).changeBehavior();
        }
    }

    //接收游客寻人寻物的委托
    public void notifyLookingFor (String lostName, Tourist seeker, String seekerName) {
        System.out.println("Broadcast类的函数notifyLookingFor接收委托，调用notifyAllTourists(String,Tourist,String)");
        notifyAllTourists(lostName, seeker, seekerName);
    }

    //通知所有游客寻人寻物
    private void notifyAllTourists(String lostName, Tourist seeker, String seekerName) {

        System.out.println("函数notifyAllTourists通知所有游客寻人寻物");
        System.out.println("广播：游客" + seekerName + "正在寻找" + lostName);

        System.out.println("函数notifyAllTourists调用Tourists类receiveSearchInformation使得其他游客接收寻人寻物通知");
        for (int i = 0; i < noticeList.size(); i++) {
            noticeList.get(i).receiveSearchInformation(lostName, seeker);
        }
    }

    //使用切换后的广播语言通知所有游客
    private void notifyAllTourists(String message){

        System.out.println(message);

        System.out.println("notifyAllTourists(String)调用Tourists中changeBehavior()使得游客行为更新");
        for (int i = 0; i < noticeList.size(); i++) {
            noticeList.get(i).changeBehavior();
        }
    }
}
