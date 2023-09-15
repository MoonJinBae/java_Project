package chap_13;

public class CardPrint {

	public static void main(String[] args) {
		Card c = new Card();
//		c.print();
//		c.setNum(13);
//		c.setShape('♠');
//		c.print();
//		c.setNum(14);
//		c.setShape('&');
//		c.print();
		
		CardPack pack = new CardPack();
		pack.shuffle(); // 카드 섞기
		
		for (int i = 1; i <= 4; i++) { // 4줄로 출력
			for (int j = 1; j <= 13; j++) { // 모양대로 13개씩
				Card tmp = pack.pick();
				tmp.print();
			}
			System.out.println(); // 줄바꿈
		}
		
		pack.init();
		pack.pick().print();
		
		
	}

}
