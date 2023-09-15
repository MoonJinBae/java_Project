package chap_12;

public class _02_Class4 {

	public static void main(String[] args) {
		// Card 객체를 생성하고, ♣Q 를 출력하려고 한다.
		Card c = new Card();
		c.print(); // 기본 생성자 값
		c.setShape('♣');
		c.setNum(13);
		c.print();
		c.setShape('◆');
		c.setNum(7);
		c.print();
		System.out.println(c.getNum());
		System.out.println(c.getShape());
		
		Card c1 = new Card('◆', 13); // 생성자는 인스턴스 객체를 생성할때 한번만 호출가능 ex) c1
		c1.print();
		
	}
	
}

/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트(♥), 클로버(♣), 다이아(◆), 스페이드(♠)
 * 숫자 : 1 ~ 10 J Q K
 * 카드 정보를 출력
 * 
 * 클래스의 구성
 * 멤버변수 : char shape, int num
 * 생성자 : 객체 생성시 멤버변수를 초기화하는 메서드(♥1)
 * 메서드 : print, getter/setter
 */
class Card{
	private char shape;
	private int num;
	
	public Card() { // 생성자 초기 값
		this.shape = '♥';
		this.num = 1;
	}
	
	public Card(char shape, int num) {
		this.shape = shape; // 모양 ♥ ♣ ◆ ♠
		this.num = num; // 숫자
	}
	// print 메서드
	// num, shape 모양에 맞춰서 출력하는 메서드
	public void print() {
		if (shape == '♥' || shape == '♣' || shape == '◆' || shape == '♠' ) {
			if (0 < num && num < 14) {
				switch (num) {
				case 11:
					System.out.println(shape +""+ 'J'); // char + char = 아스키코드상 번호로 결과 출력
					break;
				case 12:
					System.out.println(shape + "Q");
					break;
				case 13:
					System.out.println(shape + "K");
					break;
				default:
					System.out.println(shape +""+ num);
					break;
				}
			}
		}else {
			shape = '♥';
			num = 1;
			System.out.println(shape +""+ num);
		}
	}
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}