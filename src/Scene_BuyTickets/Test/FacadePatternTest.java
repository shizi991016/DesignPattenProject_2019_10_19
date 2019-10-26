package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Pool.*;

public class FacadePatternTest {
    public static void FacadePatternTest(){
        System.out.println("\n" +"classname: (objectid) : method name :action desc");
        System.out.println("----------------------------------------");
        Pool pool = new Pool();
        String userName = "小王";
        Connection connection = new Connection(userName);
        ConnectManager connectManager = new ConnectManager(userName, connection, pool);
        System.out.println("用户 " + userName + " 请求连接至迪士尼官网");
        connectManager.Connect();
        System.out.println("用户 " + userName + " 在官网上查看游乐设施");
        System.out.println("用户 " + userName + " 登出了迪士尼官网");
        connectManager.Disconnect();
        System.out.println("----------------------------------------" + "\n");
    }

}
