package Scene_InPark.Class.Broadcast;

import java.util.ArrayList;
import Scene_InPark.Class.Facilitie.Tourist;

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

        gardenState = state;//将游园状态改变为参数state

        //判断是否游园即将关闭，关闭则通知所有在名单中的游客
        if (!gardenState){
            System.out.println("Broadcast:changeGardenState:游园状态置为闭园");
            notifyAllTourists();
        }
        else{
            System.out.println("Broadcast:changeGardenState:游园并未置为关闭状态，仍为开放中");
        }
    }

    //使用适配器切换语言后，将游园置为state，并判断是否需要通知游客闭园
    public void changeGardenState (boolean state, Adapter adapter){

        gardenState = state;//将游园状态改变为参数state

        //判断是否游园即将关闭，关闭则通知所有在名单中的游客
        if (!gardenState){

            System.out.println("Broadcast:changeGardenState:游园状态置为闭园");

            //使用适配器切换语言
            String message = adapter.translate();

            //播放切换后的语音
            System.out.println("Broadcast:changeGardenState:" + message);

        }
        else{
            System.out.println("Broadcast:changeGardenState:游园并未置为关闭状态，仍为开放中");
        }
    }

    //通知所有在名单中的游客游园即将关闭
    private void notifyAllTourists(){

        System.out.println("Broadcast:notifyAllTourists:广播：游园即将关闭，请各位游客尽快出园");

        for (int i = 0; i < noticeList.size(); i++) {
            noticeList.get(i).changeBehavior();
        }
    }

    //接收游客寻人寻物的委托
    public void notifyLookingFor (String lostName, Tourist seeker, String seekerName) {
        notifyAllTourists(lostName, seeker, seekerName);
    }

    //通知所有游客寻人寻物
    private void notifyAllTourists(String lostName, Tourist seeker, String seekerName) {

        System.out.println("Broadcast:notifyAllTourists:广播：游客" + seekerName + "正在寻找" + lostName);

        for (int i = 0; i < noticeList.size(); i++) {
            noticeList.get(i).receiveSearchInformation(lostName, seeker);
        }
    }
}
