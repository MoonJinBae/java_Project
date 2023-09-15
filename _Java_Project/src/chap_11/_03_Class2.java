package chap_11;

public class _03_Class2 {

	public static void main(String[] args) {
		Car c = new Car(); // 객체생성 : Car참조 인스턴스 변수c
		c.setColor("red"); // setter로 color 변경
		c.setPower(true); // setter로 전원 on
		System.out.println(c.getPower());
		c.power();
		c.power();
		c.power();
		c.power();
		System.out.println("My Car color : " + c.getColor());
		System.out.println("My Car power : " + c.getPower());
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("My Car speed : " + c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("My Car speed : " + c.getSpeed());
	}

}
class Car { // 클래스명은 대문자로 시작
	// 멤버변수 = private 설정이 일반적
	// 메서드 = public 설정이 일반적 => getter/setter 메서드
	private String color;  // private 해당 클래스에서만 사용가능
	private boolean power;
	private int speed;


	public void power() { // 전원on, off 메서드
		power = !power; // off상태
	}
	public void speedUp() { // 속도 up 메서드
		speed++; 
	}
	public void speedDown() { // 속도 down 메서드
		speed--;
	}
	
	//getter color : private 멤버변수 color 가져다 쓰는 기능
	public String getColor() { 
		return this.color;
	}
	//setter color : private 멤버변수 color 매개변수로 초기화 하는 기능
	public void setColor(String color) {
		this.color = color;
	}
	//getter power : private 멤버변수 power 가져다 쓰는 기능
	public boolean getPower() {
		return this.power;
	}
	//setter power :private 멤버변수 power 매개변수로 초기화 하는 기능
	public void setPower(boolean power) {
		this.power = power;
	}
	//getter speed : private 멤버변수 speed 가져다 쓰는 기능
	public int getSpeed() {
		return this.speed;
	}
	//setter speed : private 멤버변수 speed 매개변수로 초기화 하는 기능
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}