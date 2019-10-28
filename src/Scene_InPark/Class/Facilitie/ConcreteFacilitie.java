package Scene_InPark.Class.Facilitie;

public class ConcreteFacilitie extends Facilitie{
	//private String name;
	public ConcreteFacilitie(String name)
	{
		this.name=name;
		this.TouristFlow=0;
	}

	@Override
	public String printAll(){
		return this.name;
	}

	@Override
	public String printFlow(){
		return this.name+":"+this.returnFlow();
	}

	@Override
	public void accept(Tourist tourist){
		this.accept(tourist);
	}
}
