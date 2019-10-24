package Scene_BuyTickets.Class.Pool;

public class ConnectManager {
    private String userName;
    private Connection connection;
    private Pool pool;
    private DataStack dataStack;
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

    public void Connect(){
        if (pool.get(connection))
        {
            listener.Listen();
            dataStack.CreateDataStack();
        }
    }

    public void Disconnect(){
        if (listener != null)
        {
            listener.DestroyListener();
            dataStack.DestroyDataStack();
        }
    }
}
