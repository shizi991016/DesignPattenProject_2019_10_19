package flyWeight;

public class ConcreteFacilitieFactory implements FacilitieFactory{

	@Override
	public Facilitie createFacilitie(String name) {
		// TODO Auto-generated method stub
		System.out.println("������ʩ����:����������ʩ:������Ϊ"+name+"�ľ�����ʩ");
		return new ConcreteFacilitie(name);
	}
	
}
