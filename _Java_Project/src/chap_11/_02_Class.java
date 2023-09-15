package chap_11;

public class _02_Class { // 파일명과 클래스 명이 같은 경우에만 public 사용
// 멤버변수 선언 위치
	public static void main(String[] args) {
		/* 클래스 : 설계도
		 * 객체 : 제품
		 * 메서드 : 기능
		 * 
		 * 클래스 구성
		 * - 속성(정보) : 멤버변수
		 * - 기능 : 메서드
		 * 
		 * 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 제품명, 종료
		 * - 기능(메서드) : 인쇄, 복사, 스캔, 팩스
		 * 
		 * 멤버변수는 클래스 안, 메서드 밖(위) 작성
		 * 멤버변수는 클래스 안에서 사용가능(모든 메서드에서 공통적으로 사용가능)
		 * 
		 * - 객체 선언
		 * 클래스명 객체명; // 선언만 값은 null
		 * 객체명 = new 클래스명();
		 * 
		 * - 객체 선언(초기화 생성)
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 메서드 사용법(클래스가 다른 메서드를 호출할 경우)
		 * 객체명.메서드명();
		 * 
		 * - 같은 클래스 안에서 메서드를 호출할 경우
		 * 메서드명();
		 * - 다른 클래스 안에서 메서드를 호출할 경우
		 * 객체명.메서드명();
		 * 
		 * 
		 * 접근제한자(제어자)
		 * public : 모두 사용가능
		 * protected : 나 + 패키지 + 자식클래스
		 * (default) : 나 + 패키지
		 * private : 나
		 * public > protected > default > private
		 * 
		 * - 클래스에 public을 붙인 수 있는 경우 : 파일명 = 클래스명 같을 경우에만 가능
		 * - 멤버 변수와 멤버 메서드 public은 문제없이 사용가능
		 * - private : 멤버변수나 멤버 메서드는 다른 클래스에서 사용할 수 없다
		 * - 일반적으로 멤버변수는 private, 메서드는 public으로 선언한다
		 * - private으로 선언된 멤버 변수는 getter / setter 메서드를 만들어서 해당 변수에 접근 한다
		 * 
		 */
		point p = new point();
		p.print();
//		p.x = 1;
//		p.y = 2;
		p.save(10, 20);
		p.print();
		System.out.println(p.getX()+1);
		p.setX(30);
		p.print();
		p.setY(100);
		p.print();
		
	}

}
/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명{
 * }
 */
class point {
	// 멤버변수 위치
//	public int x;
//	public int y;
	private int x;
	private int y;
	
	// (x,y)
	public void print()	{
		System.out.println("(" + x + "," + y +")"); 	
	}
	// point값을 저장하는 메서드
	public void save(int x, int y) { // 매개변수로 밖에서 주는 값으로 setting
		// this : 멤버변수를 지칭하는 키워드
		this.x = x;
		this.y = y;
	}
	// getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	// setter
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}