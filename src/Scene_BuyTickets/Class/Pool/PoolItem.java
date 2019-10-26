package Scene_BuyTickets.Class.Pool;

//池中对象模拟类
public class PoolItem {
    //对象是否给使用
    private boolean isUsed;
    //对象连接名
    private Connection conn;

    public PoolItem(Connection conn){
        this.conn = conn;
    }

    public PoolItem(){
        this.conn = null;
        this.isUsed = false;
    }

    //判断对象是否被使用
    public boolean getIsUsed(){
        return this.isUsed;
    }

    //将对象设置为已被使用
    public void setUsed(){
        this.isUsed = true;
    }

    //将对象设置为未被使用
    public void setUnused(){
        this.isUsed = false;
    }

    //获得对象连接名
    public Connection getCoon(){
        return this.conn;
    }

    //设置对象连接名
    public void setConnecion(Connection conn){
        this.conn = conn;
    }
}
