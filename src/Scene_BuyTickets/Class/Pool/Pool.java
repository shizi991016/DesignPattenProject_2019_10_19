package Scene_BuyTickets.Class.Pool;

import java.util.ArrayList;

public class Pool {
	private ArrayList<PoolItem> items = new ArrayList<PoolItem>();

	public synchronized void addItems(){
        items.add(new PoolItem());
    }

    public synchronized boolean get(Connection conn){
	    int len = items.size();
	    for (int i = 0; i < len; ++i)
	    {
	        PoolItem item = items.get(i);
	        if (!item.getIsUsed())
            {
                item.setUsed();
                item.setConnecion(conn);
                return true;
            }
        }
	    System.out.println("连接池已满");
	    return false;
    }

    public synchronized void release(Connection conn){
        int len = items.size();
        for (int i = 0; i < len; ++i)
        {
            PoolItem item = items.get(i);
            if (item.getCoon() == conn)
            {
                item.setUnused();
                return;
            }
        }
        System.out.println("连接不存在");
        return;
    }


}
