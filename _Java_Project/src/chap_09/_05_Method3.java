package chap_09;

public class _05_Method3 {
	
	public static void printMulti(int num1) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));
		}
	}

	public static void main(String[] args) {
		/* 정수 (2~9까지중 하나) 해당 단의 구구단이 출력메서드
		 * 매개변수 : 메서드를 실행하기 위해서 외부에서 받아오는 값
		 * 리턴타입 : 메서드를 처리 후 메인에게 다시 돌려주는 값
		 * 메서드명 : printMulti
		 */
		printMulti(5);
		
	}

}
