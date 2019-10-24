package Scene_BuyTickets.Class.Pool;

public class Connection {
    private String userName;

    public Connection(String name){
        this.userName = name;
    }

    public Connection(){
        userName = "NO NAME";
    }

    public String getConnName(){
        return this.userName;
    }

    public void setConnName(String name)
    {
        this.userName = name;
    }
}
