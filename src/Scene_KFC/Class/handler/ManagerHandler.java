package Class.handler;

public class ManagerHandler extends Handler {
    @Override
    public void handleRequest(int request)
    {
        System.out.println("大堂经理正处理该请求-->");
        if(request==2)
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
