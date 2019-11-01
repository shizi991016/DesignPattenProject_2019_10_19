package Scene_InPark.Class.Facilitie;

import java.util.ArrayList;
import java.util.List;

public class Area extends Facilitie{

	//区域内包含的设施表
	private List<Facilitie> mFacilities;

	public Area(String name)
	{
		this.name=name;
		this.TouristFlow=0;
		this.mFacilities=new ArrayList<Facilitie>();
	}

	//打印包含所有设施和区域
	@Override
    public String printAll(){
	    StringBuilder contains=new StringBuilder(this.name);
	    for(Facilitie fc:this.mFacilities){
	        contains.append("\n");
	        contains.append(fc.printAll());
        }
	    return contains.toString();
    }

    //打印全部区域和设施客流量
	@Override
	public String printFlow(){
		StringBuilder contains=new StringBuilder(this.name);
		contains.append(":"+this.returnFlow());
		for(Facilitie fc:this.mFacilities){
			contains.append("\n");
			contains.append(fc.printFlow());
		}
		return contains.toString();
	}

	//将设施添加进包含设施表
    @Override
    public boolean addChild(Facilitie fc){
	    fc.parent=this;
	    return this.mFacilities.add(fc);
    }

    //将设施移除包含设施表
    @Override
    public boolean removeChild(Facilitie fc){
	    return this.mFacilities.remove(fc);
    }

    //按索引获取包含表中的设施
    @Override
    public Facilitie getChild(int index){
	    return this.mFacilities.get(index);
    }

    //visitor模式中主要的accept函数
    @Override
	public void accept(Tourist tourist){
		this.accept(tourist);
	}
}
