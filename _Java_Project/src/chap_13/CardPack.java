package chap_13;
/* CardPack 클래스
 * - 52장의 카드 한 묶음(배열)
 * 
 * - 카드 섞는 기능
 * - 한장의 카드를 빼내는 기능 > 확인
 * - 출력 기능 > Card 클래스에서 사용
 * - 카드 초기화 기능
 */
public class CardPack {
	private Card[] pack = new Card[52]; // 52장의 카드가 들어갈 수 있는 배열
	private int cnt = 0; // 카드의 남는 개수
	
	public CardPack() { 
		char shape = '♥'; // ♥ ◆ ♣ ♠
		for (int i = 1; i <= 4; i++) {
			switch (i) { // 1 ~ 4 까지의 케이스 별로 모양 저장
			case 1 : shape = '♥'; break; 
			case 2 : shape = '◆'; break;  
			case 3 : shape = '♣'; break;  
			case 4 : shape = '♠'; break;
			}
			for (int j = 1; j <= 13; j++) { // 1 ~ 13 까지
				Card  c = new Card(); // Card클래스 객체 생성해서 사용
				c.setShape(shape); // 케이스별로 모양 저장
				c.setNum(j); // j값을 반복문으로 숫자에 저장
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	// pick 카드 한장 빼내는 기능
	// pick()
	// 현재 cnt 값은?
	// cnt = 0이라는 의미는 카드가 하나도 생성되지 않은 상황
	// 리턴타입 Card
	public Card pick() {
		if (cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	// 카드를 섞는 기능
	// shuffle();
	// 리턴타입 : void, 매개변수 : x
	public void shuffle() {
		int min = 0;
		int max = pack.length-1; // 0 ~ 51번지
		for (int i = 0; i < pack.length; i++) {
			int random = (int)(Math.random()*(max - min +1))+min;
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	// 초기화 기능
	public void init() {
		cnt = 52;
	}
	
}
