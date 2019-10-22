package multition;
import java.util.*;
//����ģʽ�������������λõ��п�����KFC
public class KFC {
	//��static��������ʵ��
	private static KFC kfc1=new KFC();
	private static KFC kfc2=new KFC();
	//���ʵ����list
	private static List<KFC> list=new ArrayList<KFC>();
	//���ʵ��������������ı�
	private static final int maxCount=2;
	//��ʵ������list
	static
	{
		list.add(kfc1);
		list.add(kfc2);
	}
	//˽�л����캯����ֹ�ⲿ����ʵ��
	private KFC()
	{
		
	}
	//��ȡʵ�����޲����������ȡ
	public static KFC getInstance()
	{
		//��ȡ�������[0,maxCount)
		Random random =new Random();
		int current = random.nextInt(maxCount);
		//�������ȡ��ʵ��
		System.out.println("KFC:getInstance(�޲���):ȡ��"+current+"��ʵ��");
		return list.get(current);
	}
	//��ȡʵ�����в���
	public static KFC getInstance(int index)
	{
		//ȡ����Ӧʵ��
		System.out.println("KFC:getInstance(�в���):ȡ��"+index+"��ʵ��");
		return list.get(index);
	}
}
