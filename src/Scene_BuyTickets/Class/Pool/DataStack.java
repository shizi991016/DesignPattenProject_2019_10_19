package Scene_BuyTickets.Class.Pool;

//数据连接栈模拟类
public class DataStack {
    //用户名
    private String userName;

    public DataStack(){
        this.userName = "NONAME";
    }

    public DataStack(String name){
        this.userName = name;
    }

    //建立数据栈
    public void CreateDataStack(){
        System.out.println("创建连接数据栈...");
        System.out.println("数据栈创建成功");
        System.out.println("开始记录用户 " + this.userName + " 的连接数据");
    }

    //销毁数据展
    public  void DestroyDataStack(){
        System.out.println("注销数据栈...");
        System.out.println("数据栈注销成功");
    }
}
