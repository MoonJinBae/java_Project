package chap_17;

public class Customer {
	/* 조상(일반고객), 자손(Gold고객)할인, 자손(VIP고객)할인
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스적립비율 : double bonusRatio
	 * 
	 * 클래스 생성
	 * - 기본 customerGrade = 'Silver'
	 * - 기본 bonusRatio = 0.01 => 1%
	 * 
	 * - 메서드
	 * 1. 보너스 적립 계산 메서드(메서드명 : calPrice(int price)
	 * => 보너스를 적립, 할인여부를 체크하여 구매 price를 리턴 => silver는 할인여부 없음
	 * - 구매금액을 주고 적립보너스를 계산 bonusPoint 누적
	 * 
	 * 2. 출력 메서드(메서드명 : customerInfo)
	 * => 홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 * 
	 * - Silver등급
	 * => 할인 0% / 보너스 1%적립
	 * - Gold등급
	 * => 제품 구매시 10%할인 / 보너스 포인트 2%적립
	 * - VIP등급
	 * => 제품 구매시 10%할인 / 보너스 포인트 5%적립
	 * 
	 * Goldcustomer extands Customer{
	 *  기본 클래스를 오버라이팅 하여 사용 }
	 *  
	 *  Main 클래스에서 확인
	 */
	protected int customerId; // 고객ID
	protected String customerName; // 고객명
	protected String customerGrade; // 고객등급
	protected int bonusPoint; // 보너스포인트
	protected double bonusRatio; // 적립률
	
	 /* - 메서드
	 * 1. 보너스 적립 계산 메서드(메서드명 : calPrice(int price)
	 * => 보너스를 적립, 할인여부를 체크하여 구매 price를 리턴 => silver는 할인여부 없음
	 * - 구매금액을 주고 적립보너스를 계산 bonusPoint 누적
	 */
	public Customer() {}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	public int calPrice(int price) { // 할인, 적립, 구매금액 리턴 
		bonusPoint += (int)(price * bonusRatio);
		System.out.println(customerName + "님의 구매금액 : " + price);
		return price;
	}
	// 2. 출력 메서드(메서드명 : customerInfo)
	// => 홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	public void customerInfo() {
		System.out.println(customerName + "님의 등급은 [" + customerGrade + "]입니다.");
		System.out.println("보너스 포인트는 [" + bonusPoint + "]입니다.");
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}