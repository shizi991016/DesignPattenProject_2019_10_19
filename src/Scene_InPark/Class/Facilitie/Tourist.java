package Scene_InPark.Class.Facilitie;

import Scene_InPark.Class.Broadcast.Broadcast;

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
	//访问某个设施的函数
	public void goToFacilitie(String name,int type)
	{
		//取得享元工厂单例
		DreamIsland factory=DreamIsland.getInstance();
		//访问享元工厂取得目标享元
		Facilitie togo=factory.getFacilitie(name,type);
		System.out.println("Tourist:"+this.name+":gotoFacilitie:从享元工厂取出享元"+name);
		//更新所在设施
		currentFacilitie=togo;
	}

	//即将闭园，游客行为改变
	public void changeBehavior() {

		int idea = (int) (Math.random() * 2);

		if (idea == 0) {
			System.out.println( this.name + "改变行为，溜进厕所，留在园内");
		}
		if (idea == 1) {
			System.out.println( this.name + "改变行为，出园回家");
		}
		if (idea == 2){
			System.out.println( this.name + "改变行为，入住酒店");
		}
	}

	//委托广播寻人寻物
	public void lookingFor (String lostName , Broadcast broadcast){
		System.out.println( this.name + "委托广播发布寻找" + lostName );
		broadcast.notifyLookingFor (lostName, this, this.name);
	}

	//接收广播寻人寻物通知
	public void receiveSearchInformation (String lostname, Tourist seeker){
		//如果寻物的不是自己，则听到广播消息
		if(seeker != this){
			System.out.println( this.name + "听到" + seeker.name +
					"寻找" + lostname + "的信息");
		}
	}

	//visitor模式中的visit方法
	public void Visit(Facilitie fc) {
		Facilitie current = fc;
		//去过的设施和包含其的所有区域的客流量都应加一
		while(current!= null) {
			current.TouristFlow++;
			current=current.parent;
		}
	}
}
