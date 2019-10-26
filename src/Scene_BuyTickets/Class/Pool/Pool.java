package Scene_BuyTickets.Class.Pool;

import java.util.ArrayList;

//对象池模拟类：对象池模式
public class Pool {
    //对象池中对象个数
    private final static int PoolItenNum = 10;

    //对象池中对象数组
	private ArrayList<PoolItem> items = new ArrayList<PoolItem>();

    //向对象池中添加初始对象，对象个数：PoolItenNum
	private synchronized void addItems(){
        for (int i = 0; i < PoolItenNum; ++i)
        {
            items.add(new PoolItem());
        }
    }

    public Pool(){
	    addItems();
    }

    //从对象池中获取一个空对象，并用Connection的值给对象赋值，返回true
    //若无可用空对象，则打印报错，并返回false
    public synchronized boolean get(Connection conn){
	    int len = items.size();
	    for (int i = 0; i < len; ++i)
	    {
	        PoolItem item = items.get(i);
	        if (!item.getIsUsed())
            {
                //将空对象设置为已被使用
                item.setUsed();
                //使用Connection对空对象赋值
                item.setConnecion(conn);
                return true;
            }
        }
	    //打印报错信息
	    System.out.println("连接池已满");
	    return false;
    }

    //释放当前Connection使用的对象
    //若未找到使用Connection的对象，则打印报错
    public synchronized void release(Connection conn){
        int len = items.size();
        for (int i = 0; i < len; ++i)
        {
            PoolItem item = items.get(i);
            if (item.getCoon() == conn)
            {
                //将对象设为未被使用
                item.setUnused();
                //清空对象值
                item.setConnecion(null);
                return;
            }
        }
        //打印报错信息
        System.out.println("连接不存在");
        return;
    }


}
