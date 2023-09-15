package chap_13;

/* Card 클래스 생성
 * - 숫자 : 1 ~ 10 , J, Q, K
 * - 모양 : ♥, ◆, ♣, ♠
 * - 한 장의 카드 정보를 출력하는 기능
 * 
 *  클래스의 구성
 *  - 멤버변수 : 모양, 숫자 => preivate선언 => getter/setter생성
 *  - 메서드 : print 메서드
 *  - 생성자 : 기본생성자만 생성 => ♥1
 */
public class Card {
	private char shape;
	private int num;
	
	// 생성자는 설정하지 않아도 기본 생성자 제공
	// 생성자는 객체 생성시 (new)에만 작동
	// Card c = new Card();  // Card(); 생성자
	 public Card() {
		shape = '♥';
		num = 1;
	}
	
	public void print() {
		System.out.print(shape);
		switch (num) {
		case 11:
			System.out.print('J' + " ");
			break;
		case 12:
			System.out.print('Q' + " ");
			break;
		case 13:
			System.out.print('K' + " ");
			break;
		default:
			System.out.print(num +" ");
			break;
		}
	
	}

	public char getShape() {
		return shape;
	}
	
	public void setShape(char shape) { //  ♥, ◆, ♣, ♠
		switch (shape) {
		case '♥': case '◆': case '♣': case '♠':
			this.shape = shape;
			break;
		default:
			this.shape = '♥';
			break;
		}
//		if (shape.equals("♥") || shape.equals("◆") || shape.equals("♣") || shape.equals("♠")) {
//			this.shape = shape;
//		}
//		else {
//			this.shape = "♥";
//		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (0 < num && num < 14) { // 1 ~ 13까지만 저장
			this.num = num;
		}
		else {
			this.num = 1; // 아니면 기본값 1
		}
	}
	
}



