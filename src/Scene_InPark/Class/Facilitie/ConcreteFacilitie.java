package Scene_InPark.Class.Facilitie;

public class ConcreteFacilitie extends Facilitie{
	public ConcreteFacilitie(String name)
	{
		this.name=name;
		this.TouristFlow=0;
	}

	//打印该设施的名称
	@Override
	public String printAll(){
		return this.name;
	}

	//打印该设施的客流量
	@Override
	public String printFlow(){
		return this.name+":"+this.returnFlow();
	}

	//visitor模式中主要的accept函数
	@Override
	public void accept(Tourist tourist){
		this.accept(tourist);
	}
}
