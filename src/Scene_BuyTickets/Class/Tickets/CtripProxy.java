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
	public void Validate() {
		ticket.Validate();
	}

	//模拟选择门票类型
	@Override
	public void Select(String type) {
		ticket.Select(type);
	}

	//模拟支付
	@Override
	public void Pay() {
		ticket.Pay();
	}
	
}


