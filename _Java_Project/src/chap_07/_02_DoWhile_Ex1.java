package chap_07;

import java.util.Scanner;

public class _02_DoWhile_Ex1 {

	public static void main(String[] args) {
		// do~while문을 이용하여
		// 값을 입력하면 그대로 출력
		// 단, y/Y 입력되면종료
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("입력 하세요(y / Y : 종료)");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			if (ch == 'y' || ch == 'Y') {
				System.out.println("종료");
				break;
			}
		} while (true); // (!(ch == 'y' || ch == 'Y')) 로 사용 가능
		
		scan.close();
	}

}
