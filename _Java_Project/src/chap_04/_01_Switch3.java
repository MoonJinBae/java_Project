package chap_04;

public class _01_Switch3 {

	public static void main(String[] args) {
		// 랜덤으로 1부터 7까지의 숫자를 발생시켜
		// 1 = 일요일, 2 = 월요일, 3 = 수욜일... 7 = 토요일
		
		int random = (int)(Math.random()*7)+1;
		switch (random) {
		case 1:
			System.out.println("일요일 입니다.");
			break;
		case 2:
			System.out.println("월요일 입니다.");
			break;
		case 3:
			System.out.println("화요일 입니다.");
			break;
		case 4:
			System.out.println("수요일 입니다.");
			break;
		case 5:
			System.out.println("목요일 입니다.");
			break;
		case 6:
			System.out.println("금요일 입니다.");
			break;
		case 7:
			System.out.println("토요일 입니다.");
			break;
		default: // 생략가능
			break;
		}
	}

}
