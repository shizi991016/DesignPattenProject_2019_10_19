package flyWeight;

public class AreaFactory implements FacilitieFactory{

	@Override
	public Facilitie createFacilitie(String name) {
		// TODO Auto-generated method stub
		System.out.println("区域工厂:创建区域:创建名为"+name+"的区域");
		return new Area(name);
	}
	
}
