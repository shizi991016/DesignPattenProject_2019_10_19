package Class.handler;

public class DirectorHandler extends Handler {
    @Override
    public void handleRequest(int request)
    {
        System.out.println("店长正处理该请求-->");
        if(request==3)
        {
            System.out.println("请求处理完成");
        }
        else
        {
            if(getNext()!=null)
            {
                getNext().handleRequest(request);
            }
            else {
                System.out.println("在场无人能处理您的请求！");
            }
        }
    }
}
