package Class.handler;

public abstract class Handler {
    private Handler nextHandler; //下一个处理者

    public void setNext(Handler next)//创建下一个处理者
    {
        this.nextHandler=next;
    }

    public Handler getNext()//获取下一个处理者
    {
        return nextHandler;
    }

    public abstract void handleRequest(int request);//处理请求的抽象方法
}
