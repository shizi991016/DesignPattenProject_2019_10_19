package flyWeight;
import java.util.*;
public class DreamIsland {
	//��Ԫ�������ǵ�������static
	private static DreamIsland singleton = new DreamIsland();
	//�����Ԫ����������HashTable�����ڴ�ȡ
	private Hashtable<String, Facilitie> pool=new Hashtable();
	//˽�л����캯������ֹ�ⲿ��������
	private DreamIsland() {}
	//�������λõ���Ϊ��Ԫ����������ʹ���˵���ģʽ
	public static DreamIsland getInstance()
	{
		//���ص���
		System.out.println("DreamIsland:getInstance:ȡ���λõ�����");
		return singleton;
	}
	//��������ʩ����������Ϊ��Ԫ
	public synchronized Facilitie getFacilitie(String name)
	{
		//������ȡ��������ʩ
		Facilitie fc=(Facilitie)pool.get(name);
		//û�оʹ���һ��Ȼ������ϣ����
		if(fc==null)
		{
			FacilitieFactory fcFactory;
			Scanner sc = new Scanner(System.in);
			System.out.print("��������ʩ����:1Ϊ������ʩ��2Ϊ����");
			int type=sc.nextInt();
			if (type==1)
			{
				System.out.println("�λõ�:��ȡ��ʩ:����������ʩ����");
				fcFactory=new ConcreteFacilitieFactory();
				fc=fcFactory.createFacilitie(name);
			}
			else
			{
				System.out.println("�λõ�:��ȡ��ʩ:�������򹤳�");
				fcFactory=new AreaFactory();
				fc=fcFactory.createFacilitie(name);
			}
			pool.put(name, fc);
			System.out.println("�λõ�:getFcilitie:��"+name+"��Ϊ��Ԫ������Ԫ����");
		}
		return fc;
	}
}
