package Scene_KFC.Test;


import Scene_KFC.Class.handler.DirectorHandler;
import Scene_KFC.Class.handler.Handler;
import Scene_KFC.Class.handler.ManagerHandler;
import Scene_KFC.Class.handler.WaiterHandler;

public class ResponsibilityPattern {
    public static void main(String[] args)
    {
        //初始化责任链成员
        Handler waiter=new WaiterHandler();
        Handler manager=new ManagerHandler();
        Handler director=new DirectorHandler();
        //组装责任链
        waiter.setNext(manager);
        manager.setNext(director);
        //开始测试
        System.out.println("\n" +"classname: (objectid) : method name :action desc");
        System.out.println("----------------------------------------");
//        System.out.println("模式k 责任链模式(Chain of Responsibility)：");
//        System.out.println("相关类：Handler WaiterHandler ManagerHandler DirectorHandler");
        System.out.println("请求在责任链第一级即Waiter级完成：");
        waiter.handleRequest(1);
        System.out.println("\n请求在责任链第二级即Manager级完成：");
        waiter.handleRequest(2);
        System.out.println("\n请求在责任链第三级即Director级完成：");
        waiter.handleRequest(3);
        System.out.println("\n请求在该责任链中无法完成：");
        waiter.handleRequest(4);
        System.out.println("----------------------------------------");
    }
}