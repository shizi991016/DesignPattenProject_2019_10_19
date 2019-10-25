<<<<<<< Updated upstream:src/Scene_KFC/Class/KFC/KFC.java
package Scene_KFC.Class.KFC;
=======
package Class;
>>>>>>> Stashed changes:src/Scene_KFC/Class/KFC.java
import java.util.*;
//多例模式，至多允许在梦幻岛中开两家KFC
public class KFC {
	//以static声明两个实例
	private static KFC kfc1=new KFC();
	private static KFC kfc2=new KFC();
	//存放实例的list
	private static List<KFC> list=new ArrayList<KFC>();
	//最大实例数量，不允许改变
	private static final int maxCount=2;
	//将实例加入list
	static
	{
		list.add(kfc1);
		list.add(kfc2);
	}
	//私有化构造函数防止外部创建实例
	private KFC()
	{
		
	}
	//获取实例，无参数，随机获取
	public static KFC getInstance()
	{
		//获取随机数，[0,maxCount)
		Random random =new Random();
		int current = random.nextInt(maxCount);
		//以随机数取出实例
		System.out.println("KFC:getInstance(无参数):取得"+current+"号实例");
		return list.get(current);
	}
	//获取实例，有参数
	public static KFC getInstance(int index)
	{
		//取出对应实例
		System.out.println("KFC:getInstance(有参数):取得"+index+"号实例");
		return list.get(index);
	}
}
