package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Tickets.*;

public class ProxyPatternTest {
    public static void proxyPatternTest(){
        System.out.println("\n" +"classname: (objectid) : method name :action desc");
        System.out.println("----------------------------------------");
        TicketsBuyer ticketsBuyer = new TicketsBuyer("小王");
        CtripProxy ctripProxy = new CtripProxy(ticketsBuyer);
        System.out.println("小王选择使用携程代理购买迪士尼乐园门票");
        ctripProxy.validate();
        ctripProxy.select("标准门票————成人票");
        ctripProxy.pay();
        System.out.println("----------------------------------------" + "\n");
    }
}
