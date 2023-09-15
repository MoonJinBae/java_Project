package chap_05;

import java.util.Scanner;

public class _06_Homework {

	public static void main(String[] args) {
		// up/down 게임 (클럽에 제출)
		// 1 ~ 50 사이의 랜덤수를 생성하여 맞추는 게임
		// ex) 컴퓨터가 생성한 랜덤수 : 45
		// 컴퓨터가 랜덤수를 생성하였습니다.
		// 입력 > 10
		// up~!!
		// 입력 > 20
		// up~!!
		// 입력 > 50
		// down~!!
		// 입력 > 45
		// 정답~!! 종료~!!
		
		Scanner scan = new Scanner(System.in);
		int val = (int)(Math.random()*50)+1;
		System.out.println("랜덤 수가 생성 되었습니다.\n1 ~ 50 까지 정수를 입력 하세요.");
//		for (int i=1; ;i++) {
//			int num = scan.nextInt();
//			if (num < 1 || num > 50) {
//				System.out.println("범위를 벗어 났습니다.(1 ~ 50)까지 입력 하세요.\n입력 횟수 : " + i);
//				continue;
//			}
//			else if (num == val) {
//				System.out.println("정답~~종료!!\n입력 횟수 : " + i);
//				break;
//			}
//			else if (num < val) {
//				System.out.println("up~!!");
//			}
//			else if (num > val) {
//				System.out.println("down~!!");
//			}
//			System.out.println("다시 입력 하세요.\n입력 횟수 : " + i);
//		}
		
		// while문 사용
		int count = 1;
		while (true) {
			int num = scan.nextInt();
			if (num < 1 || num > 50) {
				System.out.println("범위를 벗어 났습니다.(1 ~ 50)까지 입력 하세요.\n입력 횟수 : " + count);
				count++;
				continue;
			}
			else if (num == val) {
				System.out.println("정답~~종료!! 정답은?? : " + val + "\n입력 횟수 : " + count);
				count++;
				break;
			}
			else if (num < val) {
				System.out.println("up~!!");
			}
			else if (num > val) {
				System.out.println("down~!!");
			}
			System.out.println("다시 입력 하세요.\n입력 횟수 : " + count);
			count++;
		}
		
		
		scan.close();
	}

}
