package Scene_BuyTickets.Class;

public class TicketsBuyer extends Tickets {
	private String name;
	
	public TicketsBuyer(String name) {
		this.name = name;
	}
	
	public TicketsBuyer() {
		this.name = null;
	}
	
	@Override
	public void Validate() {
		System.out.println("用户" + name + "登陆成功");
	}
	
	@Override
	public void Select(String type) {
		System.out.println("用户" + name + "选择" + type);
	}
	
	@Override
	public void Pay() {
		System.out.println("用户" + name + "支付成功");
	}
}




