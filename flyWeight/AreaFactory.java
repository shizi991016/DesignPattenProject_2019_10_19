package flyWeight;

public class AreaFactory implements FacilitieFactory{

	@Override
	public Facilitie createFacilitie(String name) {
		// TODO Auto-generated method stub
		System.out.println("���򹤳�:��������:������Ϊ"+name+"������");
		return new Area(name);
	}
	
}
