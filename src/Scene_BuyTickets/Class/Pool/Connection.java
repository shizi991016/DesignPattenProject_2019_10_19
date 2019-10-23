package Scene_BuyTickets.Class.Pool;

public class Connection {
    private String connName;

    public Connection(String name){
        this.connName = name;
    }

    public Connection(){
        connName = "NO NAME";
    }

    public String getConnName(){
        return this.connName;
    }

    public void setConnName(String name)
    {
        this.connName = name;
    }
}
