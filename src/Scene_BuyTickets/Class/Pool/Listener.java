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
    public void Listen(){
        System.out.println("Set Listener to " + this.userName + "'s Connection");
    }

    //销毁监听器
    public void DestroyListener(){
        System.out.println("Destroy Listener");
    }
}
