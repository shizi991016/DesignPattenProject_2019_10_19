package Scene_KFC.Test;


import Scene_KFC.Class.handler.DirectorHandler;
import Scene_KFC.Class.handler.Handler;
import Scene_KFC.Class.handler.ManagerHandler;
import Scene_KFC.Class.handler.WaiterHandler;

public class ResponsbilityPattern {
    public static void main(String[] args)
    {
        //初始化责任链
        Handler waiter=new WaiterHandler();
        Handler manager=new ManagerHandler();
        Handler director=new DirectorHandler();
        //组装责任链
        waiter.setNext(manager);
        manager.setNext(director);
        //处理请求
        waiter.handleRequest(1);
        waiter.handleRequest(2);
        waiter.handleRequest(3);
        waiter.handleRequest(4);
    }
}
