package main;

import Scene_BuyTickets.*;
import Scene_BuyTickets.Class.Tickets.CtripProxy;
import Scene_BuyTickets.Class.Tickets.TicketsBuyer;

public class DesignPattern_main {
	public static void main(String[] args) {
		System.out.print("ssss");
		TicketsBuyer buyer = new TicketsBuyer("Hades");
		CtripProxy ctrip = new CtripProxy(buyer);
		ctrip.Validate();
		ctrip.Select("A类票");
		ctrip.Pay();
	}

}
