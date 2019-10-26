package Scene_InPark.Class.Facilitie;
import java.util.*;

public class DreamIsland {
	//享元工厂，是单例，用static
	private static DreamIsland singleton = new DreamIsland();
	//存放享元的容器，用HashTable，便于存取
	private Hashtable<String, Facilitie> pool=new Hashtable();
	//私有化构造函数，防止外部创建对象
	private DreamIsland() {}
	//将整个梦幻岛作为享元工厂，这里使用了单例模式
	public static DreamIsland getInstance()
	{
		//返回单例
		System.out.println("DreamIsland：getInstance:取得梦幻岛单例");
		return singleton;
	}
	//将所有设施及其名字作为享元
	public synchronized Facilitie getFacilitie(String name,int type)
	{
		//用名字取出具体设施
		Facilitie fc=(Facilitie)pool.get(name);
		//没有就创建一个然后放入哈希表中
		if(fc==null)
		{
			FacilitieFactory fcFactory;
			if (type==1)
			{
				System.out.println("梦幻岛:获取设施:创建具体设施工厂");
				fcFactory=new ConcreteFacilitieFactory();
				fc=fcFactory.createFacilitie(name);
			}
			else
			{
				System.out.println("梦幻岛:获取设施:创建区域工厂");
				fcFactory=new AreaFactory();
				fc=fcFactory.createFacilitie(name);
			}
			pool.put(name, fc);
			System.out.println("梦幻岛:getFacilitie:将"+name+"作为享元加入享元工厂");
		}
		return fc;
	}
	public synchronized Facilitie getFacilitie(String name)
	{
		Facilitie fc=(Facilitie)pool.get(name);
		if(fc==null)
		{
			System.out.println("DreamIsland：getFacilitie:不存在名为"+name+"的设施");
		}
		return fc;
	}
}
