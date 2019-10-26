package Scene_BuyTickets.Class.Tickets;

//购票者，继承自门票抽象类
public class TicketsBuyer extends Tickets {

	//购票者姓名
	private String name;
	
	public TicketsBuyer(String name) {
		this.name = name;
	}
	
	public TicketsBuyer() {
		this.name = null;
	}

	//模拟登录
	@Override
	public void Validate() {
		System.out.println("用户 " + name + " 登陆成功");
	}

	//模拟选择门票类型
	@Override
	public void Select(String type) {
		System.out.println("用户 " + name + " 选择" + type);
	}

	//模拟支付
	@Override
	public void Pay() {
		System.out.println("用户 " + name + " 支付成功");
	}

}




