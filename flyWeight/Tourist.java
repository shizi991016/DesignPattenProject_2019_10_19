package flyWeight;

public class Tourist {
	//��ǰ������ʩ
	private Facilitie currentFacilitie;
	//�ο͵�����
	private String name;
	public Tourist(String name)
	{
		this.name=name;
		currentFacilitie=null;
	}
	//����ĳ����ʩ�ĺ�ʽ
	public void goToFacilitie(String name)
	{
		//ȡ����Ԫ��������
		DreamIsland factory=DreamIsland.getInstance();
		//������Ԫ����ȡ��Ŀ����Ԫ
		Facilitie togo=factory.getFacilitie(name);
		System.out.println("Tourist:"+this.name+":gotoFacilitie:����Ԫ����ȡ����Ԫ"+name);
		//����������ʩ
		currentFacilitie=togo;
	}
}
