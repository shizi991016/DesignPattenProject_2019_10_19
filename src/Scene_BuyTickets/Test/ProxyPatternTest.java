package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Tickets.*;

public class ProxyPatternTest {
    public static void proxyPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("6. 代理模式(ProxyPattern):");
        System.out.println("\n测试一:");
        System.out.println("某某方法测试");
        System.out.println("吧啦吧啦吧啦吧啦吧啦吧啦");
        System.out.println("\n测试二:");
        System.out.println("另某某方法测试");
        System.out.println("吧啦吧啦吧啦吧啦吧啦吧啦");
        System.out.println("\n测试三:");
        System.out.println("代理函数测试");
        TicketsBuyer ticketsBuyer = new TicketsBuyer("小王");
        CtripProxy ctripProxy = new CtripProxy(ticketsBuyer);
        System.out.println("小王选择使用携程代理购买迪士尼乐园门票");
        ctripProxy.validate();
        ctripProxy.select("标准门票————成人票");
        ctripProxy.pay();
        System.out.println("----------------------------------------" + "\n");
    }
}
