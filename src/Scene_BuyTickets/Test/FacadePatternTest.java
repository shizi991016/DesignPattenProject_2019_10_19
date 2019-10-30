package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Pool.*;

public class FacadePatternTest {
    public static void facadePatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("8. 门面模式(FacadePattern):");
        System.out.println("\n测试一:");
        System.out.println("连接门面函数测试");
        Pool pool = new Pool();
        String userName = "小王";
        Connection connection = new Connection(userName);
        ConnectManager connectManager = new ConnectManager(userName, connection, pool);
        System.out.println("用户 " + userName + " 请求连接至迪士尼官网");
        connectManager.connect();
        System.out.println("用户 " + userName + " 在官网上查看游乐设施");
        System.out.println("用户 " + userName + " 登出了迪士尼官网");
        connectManager.disconnect();
        System.out.println("----------------------------------------" + "\n");
    }

}
