package Scene_InPark.Class.Facilitie;

public abstract class Facilitie {
	protected String name;
	protected Facilitie parent;
	protected int TouristFlow;
	protected int type;
	//构造函数
	public Facilitie(String name)
	{
		this.name=name;
		this.parent=null;
		this.TouristFlow=0;
	}
	public Facilitie()
	{
		this.name=null;
		this.parent=null;
		this.TouristFlow=0;
	}

	//验证composite模式的两个函数，分别打印：当前facilitie包含的facilitie；当前facilitie所处的位置（目录）
	public abstract String printAll();
	public String printDirectory(){
		Facilitie current = this;
		StringBuilder directory = new StringBuilder();
		directory.append(this.name);
		while(current.parent!=null){
			directory.insert(0,"-->");
			directory.insert(0,current.parent.name);
			current = current.parent;
		}
		return directory.toString();
	}

	//composite模式中的包含关系的建立
	public boolean addChild(Facilitie fc){
		throw new UnsupportedOperationException("addChild not supported!");
	};
	public boolean removeChild(Facilitie fc){
		throw new UnsupportedOperationException("removeChild not supported!");
	};
	public Facilitie getChild(int index){
		throw new UnsupportedOperationException("getChild not supported!");
	};

	//visitor模式的核心方法，接收visitor的访问
	public abstract void accept(Tourist tourist);
	public int returnFlow(){return TouristFlow;}

	//打所有设施和区域的客流量
	public abstract String printFlow();

	//返回设施类型（设施或区域）
	public int returnType(){
		return type;
	}
}