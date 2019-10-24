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
        System.out.println("Set Data Stack to " + this.userName + "'s Connection");
    }

    //销毁数据展
    public  void DestroyDataStack(){
        System.out.println("Destroy Data Stack");
    }
}
