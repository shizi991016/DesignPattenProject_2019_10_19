package Scene_KFC.Class;

public class Tourist {
	private String name;
	private KFC currentKFC;
	public Tourist(String name)
	{
		this.name=name;
		this.currentKFC=null;
	}
	public void gotoKFC(int index)
	{
		this.currentKFC=KFC.getInstance(index);
		System.out.println("Tourist:"+name+":gotoKFC(有参数):前往"+index+"号KFC");
	}
	public void gotoKFC()
	{
		this.currentKFC=KFC.getInstance();
		System.out.println("Tourist:"+name+":gotoKFC(无参数):前往KFC");
	}
}
