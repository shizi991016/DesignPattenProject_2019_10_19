package Scene_BuyTickets.Class.Tickets;

//门票抽象类
public abstract class Tickets {
	//模拟登录抽象函数
	public abstract void validate();

	//模拟选择门票种类抽象函数
	public abstract void select(String type);

	//模拟支付抽象函数
	public abstract void pay();
}
