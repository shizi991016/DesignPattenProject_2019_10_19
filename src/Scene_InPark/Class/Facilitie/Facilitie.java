package Scene_InPark.Class.Facilitie;

public abstract class Facilitie {
	protected String name;
	protected Facilitie parent;
	//构造函数
	public Facilitie(String name)
	{
		this.name=name;
		this.parent=null;
	}
	public Facilitie()
	{
		this.name=null;
		this.parent=null;
	}

	public abstract String printAll();
	public String printDirectory(){
		Facilitie current = this;
		StringBuilder directory = new StringBuilder();
		directory.append(this.name);
		while(current.parent!=null){
			directory.insert(0,"/");
			directory.insert(0,current.parent.name);
			current = current.parent;
		}
		return directory.toString();
	}

	public boolean addChild(Facilitie fc){
		throw new UnsupportedOperationException("addChild not supported!");
	};
	public boolean removeChild(Facilitie fc){
		throw new UnsupportedOperationException("removeChild not supported!");
	};
	public Facilitie getChild(int index){
		throw new UnsupportedOperationException("getChild not supported!");
	};
}