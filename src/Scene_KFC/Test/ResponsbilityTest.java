package Test;


import Class.handler.DirectorHandler;
import Class.handler.Handler;
import Class.handler.ManagerHandler;
import Class.handler.WaiterHandler;

public class ResponsbilityTest {
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