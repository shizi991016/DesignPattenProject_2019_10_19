package Scene_BuyTickets.Class.Pool;

//数据库连接模拟类
public class Connection {
    //用户名
    private String userName;

    public Connection(String name){
        this.userName = name;
    }

    public Connection(){
        userName = "NO NAME";
    }

    //获得连接名
    public String getConnName(){
        return this.userName;
    }

    //设置连接名
    public void setConnName(String name)
    {
        this.userName = name;
    }
}
