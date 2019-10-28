package Scene_BuyTickets.Class.Tickets;

//携程代理类
public class CtripProxy extends Tickets {
	private Tickets ticket;
	
	public CtripProxy () {
		this.ticket = null;
	}
	
	public CtripProxy (Tickets ticket) {
		this.ticket = ticket;
	}

	//模拟登录
	@Override
	public void validate() {
		System.out.println("欢迎使用携程");
		System.out.println("携程提醒您：");
		ticket.validate();
	}

	//模拟选择门票类型
	@Override
	public void select(String type) {
		System.out.println("携程提醒您：");
		ticket.select(type);
	}

	//模拟支付
	@Override
	public void pay() {
		System.out.println("携程提醒您：");
		ticket.pay();
	}
	
}


