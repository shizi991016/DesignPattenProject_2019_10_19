package multition;

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
		System.out.println("Tourist:"+name+":gotoKFC(�в���):ǰ��"+index+"��KFC");
	}
	public void gotoKFC()
	{
		this.currentKFC=KFC.getInstance();
		System.out.println("Tourist:"+name+":gotoKFC(�޲���):ǰ��KFC");
	}
}
