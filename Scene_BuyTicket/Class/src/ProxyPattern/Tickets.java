package ProxyPattern;

public interface Tickets {
	public abstract void Validate();			//验证信息
	public abstract void Select(String type);	//选择门票种类
	public abstract void Pay();					//支付
}
