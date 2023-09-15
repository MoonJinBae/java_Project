package chap_03;

public class _04_Switch {

	public static void main(String[] args) {
		// switch(변수/식) {
		// case 값1 : 실행문1; break;
		// case 값2 : 실행문2; break; ...
		// default : 나머지 실행문; break; }
		// break; switch문을 빠져나가는 구문

		int num = 2;
		switch (num) {
		case 1: {
			System.out.println("1 입니다.");
		}
			break;
		case 2: {
			System.out.println("2 입니다.");
		}
			break;
		case 3: {
			System.out.println("3 입니다.");
		}
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		System.out.println("---------------");
		// 1~3 까지의 수를 랜덤으로 추출하여 값이 1인지, 2인지, 3인지 판단하여 출력
		int random = (int) (Math.random() * 3) + 1;
		switch (random) {
		case 1: {
			System.out.println(random + "이 나왔습니다.");
		}
			break;
		case 2: {
			System.out.println(random + "이 나왔습니다.");
		}
			break;
		case 3: {
			System.out.println(random + "이 나왔습니다.");
		}
			break;
		default:
			System.out.println("1~3의 범위를 벗어났습니다.");
			break;
		}
		System.out.println("---------------");
		// 1 ~ 3 등급의 가격 출력
		int index = 1; //등급
		int val = 0;
		switch (index) {
		case 1: {
			val += 1000;
		}
		case 2: {
			val += 1000;
		}
		case 3: {
			val += 1000;
		}
		System.out.println(index + "등급의 가격은 " + val + "원 입니다.");
		break;
		default:
			System.out.println("1 ~ 3등급 까지만 취급합니다.");
			break;
		}
		
	}
}
