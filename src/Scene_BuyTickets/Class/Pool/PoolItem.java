package Scene_BuyTickets.Class.Pool;

public class PoolItem {
    private boolean isUsed;
    private Connection conn;

    public PoolItem(Connection conn){
        this.conn = conn;
    }

    public PoolItem(){
        this.conn = null;
        this.isUsed = true;
    }

    public boolean getIsUsed(){
        return this.isUsed;
    }

    public void setUsed(){
        this.isUsed = true;
    }

    public void setUnused(){
        this.isUsed = false;
    }

    public Connection getCoon(){
        return this.conn;
    }
}
