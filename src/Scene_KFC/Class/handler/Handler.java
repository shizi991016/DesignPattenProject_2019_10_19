package Scene_KFC.Class.handler;

public abstract class Handler {
    private Handler nextHandler; //下一个处理者

    //创建下一个处理者
    public void setNext(Handler next)
    {
        this.nextHandler=next;
    }

    //获取下一个处理者
    public Handler getNext()
    {
        return nextHandler;
    }

    //处理请求的抽象方法
    public abstract void handleRequest(int request);
}
