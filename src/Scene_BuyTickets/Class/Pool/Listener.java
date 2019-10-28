package Scene_BuyTickets.Class.Pool;

//数据连接监听器模拟类
public class Listener {
    //用户名
    private String userName;

    public Listener(){
        this.userName = "NONAME";
    }

    public Listener(String name){
        this.userName = name;
    }

    //建立监听器
    public void listen(){
        System.out.println("创建监听器...");
        System.out.println("监听器创建成功");
        System.out.println("正在监听用户 " + this.userName + " 的连接");
    }

    //销毁监听器
    public void destroyListener(){
        System.out.println("注销监听器...");
        System.out.println("监听器注销成功");
    }
}
