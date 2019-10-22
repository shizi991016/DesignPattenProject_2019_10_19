package Scene_BuyTickets.Class;


public class CtripProxy extends Tickets {
	private Tickets ticket;
	
	public CtripProxy () {
		this.ticket = null;
	}
	
	public CtripProxy (Tickets ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void Validate() {
		ticket.Validate();
	}
	
	@Override
	public void Select(String type) {
		ticket.Select(type);
	}
	
	@Override
	public void Pay() {
		ticket.Pay();
	}
	
}


