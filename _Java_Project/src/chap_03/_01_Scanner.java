package chap_03;

import java.util.Scanner;

public class _01_Scanner {
	
	public static void main(String[] args) {
		// 콘솔입력: 콘솔에서 값을 입력 받는 것을 의미
		// Scanner : 클래스 => 콘솔에서 값을 입력 받을수 있게 해주는 클래스
		// 값을 콘솔에서 입력 받아서 그 값이 짝수인지 홀수인지 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자(정수)를 입력 해주세요.\n내가 입력한 숫자 : ");
		int num = scan.nextInt(); // 스캐너를 통해 입력값 받음
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		// 숫자를 입력 받아서 양수인지, 음수인지, 0인지 판별하여 출력
		System.out.println("숫자(정수)를 입력 해주세요2.");
		int num1 =scan.nextInt();
		if (num1 > 0) {
			System.out.println(num1 + " : 양수");
		}
		else if (num1 < 0) {
			System.out.println(num1 + " : 음수");
			System.out.println(Math.abs(num1) + " : 절대값으로 변환");
		}
		else {
			System.out.println(num1 + " : 0");
		}
		System.out.println("---------------");
		System.out.println("한글자만 입력");
		
		// 문자 입력 : 한글자만 입력받기 => next().charAt(index) : index번지 1글자만 추출
		char ch = scan.next().charAt(0); // a b c ...
		System.out.println("확인 => " + ch);
		
		// 문자열 입력 : 여러글자 입력받기(공백 포함하지 않음) =>scan.next();
		System.out.println("한 단어 입력");
		String s = scan.next();
		System.out.println("확인 => " + s);
		
		scan.nextLine(); // 앞의 Enter 공백을 날리는 역할을 함
		// 문자열 입력 : 공백 포함 => scan.nextline();
		System.out.println("공백 포함 여러단어 입력");
		String s2 = scan.nextLine();
		System.out.println("확인 > " + s2);
		
		scan.close();
	}

}
