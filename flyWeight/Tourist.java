package flyWeight;

public class Tourist {
	//当前所在设施
	private Facilitie currentFacilitie;
	//游客的名字
	private String name;
	public Tourist(String name)
	{
		this.name=name;
		currentFacilitie=null;
	}
	//访问某个设施的韩式
	public void goToFacilitie(String name)
	{
		//取得享元工厂单例
		DreamIsland factory=DreamIsland.getInstance();
		//访问享元工厂取得目标享元
		Facilitie togo=factory.getFacilitie(name);
		System.out.println("Tourist:"+this.name+":gotoFacilitie:从享元工厂取出享元"+name);
		//更新所在设施
		currentFacilitie=togo;
	}
}
