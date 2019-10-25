package Scene_InPark.Class.Facilitie;

import java.util.ArrayList;
import java.util.List;

public class Area extends Facilitie{

//private String name;
	private List<Facilitie> mFacilities;

	public Area(String name)
	{
		this.name=name;
		this.TouristFlow=0;
		this.mFacilities=new ArrayList<Facilitie>();
	}

	@Override
    public String printAll(){
	    StringBuilder contains=new StringBuilder(this.name);
	    for(Facilitie fc:this.mFacilities){
	        contains.append("\n");
	        contains.append(fc.printAll());
        }
	    return contains.toString();
    }

    @Override
    public boolean addChild(Facilitie fc){
	    fc.parent=this;
	    return this.mFacilities.add(fc);
    }

    @Override
    public boolean removeChild(Facilitie fc){
	    return this.mFacilities.remove(fc);
    }

    @Override
    public Facilitie getChild(int index){
	    return this.mFacilities.get(index);
    }

    @Override
	public void accept(Tourist tourist){
		this.accept(tourist);
	}
}
