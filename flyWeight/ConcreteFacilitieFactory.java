package flyWeight;

public class ConcreteFacilitieFactory implements FacilitieFactory{

	@Override
	public Facilitie createFacilitie(String name) {
		// TODO Auto-generated method stub
		System.out.println("具体设施工厂:创建具体设施:创建名为"+name+"的具体设施");
		return new ConcreteFacilitie(name);
	}
	
}
