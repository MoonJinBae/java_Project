package chap_17;

public class VipCustomer extends Customer{
	double saleRatio;
	
	public VipCustomer() {}
	public VipCustomer(int id, String name) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	@Override
	public int calPrice(int price) {
		super.calPrice(price);
		return price - (int)(price * saleRatio);
	}
	
}
