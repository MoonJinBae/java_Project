package chap_17;

public class CustomerMain {

	public static void main(String[] args) {
		Customer s = new Customer(011,"홍길동");
		GoldCustomer g = new GoldCustomer(012, "철수");
		VipCustomer v = new VipCustomer(013, "영희");
		
//		s.calPrice(1000);
//		s.customerInfo();
//		System.out.println("--------------");
//		g.calPrice(10000);
//		g.customerInfo();
//		System.out.println("--------------");
//		v.calPrice(5500);
//		v.customerInfo();
//		System.out.println("--------------");
		
		Customer[] customerList = new Customer[10];
		int cnt = 0;
		int price = 7000;
		customerList[cnt] = s;
		cnt++;
		customerList[cnt] = g;
		cnt++;
		customerList[cnt] = v;
		cnt++;
		
		System.out.println("--고객정보 출력--");
		for (int i = 0; i < cnt; i++) {
			customerList[i].calPrice(price);
			customerList[i].customerInfo();
			System.out.println("-------------------");
		}
		
	}

}
