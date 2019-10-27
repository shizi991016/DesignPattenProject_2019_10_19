package Scene_BuyTickets.Class.Pool;

//数据连接管理模拟类：门面模式
public class ConnectManager {
    //用户名
    private String userName;
    //数据连接名
    private Connection connection;
    //数据连接对象池
    private Pool pool;
    //数据连接栈
    private DataStack dataStack;
    //数据连接监听器
    private Listener listener;

    public ConnectManager(){
        this.pool = null;
        this.userName = "NONAME";
        this.dataStack = null;
        this.listener = null;
        this.connection = null;
    }

    public ConnectManager(String user, Connection connection, Pool pool){
        this.connection = connection;
        this.userName = user;
        this.listener = new Listener(this.userName);
        this.dataStack = new DataStack(this.userName);
        this.pool = pool;
    }

    //建立连接
    public void Connect(){
        if (pool.get(connection))
        {
            listener.Listen();
            dataStack.CreateDataStack();
        }
    }

    //断开连接
    public void Disconnect(){
        if (listener != null)
        {
            listener.DestroyListener();
            dataStack.DestroyDataStack();
        }
    }
}
