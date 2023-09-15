package chap_03;

import java.util.Scanner;

public class _02_If2 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 입력 받아서 합계, 평균
		// 평균이 90 이상이면 A
		// 평균이 80 이상이면 B
		// 평균이 70 이상여면 C
		// 나머지는 D
		// 입력값이 0보다 작거나, 100보다 크면 잘못된 값입니다.
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("평균 점수(0 ~ 100)를 : 국, 영, 수 순으로 입력해 주세요.\r국어 점수 : ");
		int kor = scan.nextInt();
		if (kor < 0 || kor > 100) {
			System.out.println("국어 점수가 입력 범위를 벗어났습니다.(error)");
		}
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		if (eng < 0 || eng > 100) {
			System.out.println("영어 점수가 입력 범위를 벗어났습니다.(error)");
		}
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		if (math < 0 || math > 100) {
			System.out.println("수학 점수가 입력 범위를 벗어났습니다.(error)");
		}
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		System.out.println("세 과목 합계 : " + sum + ", 세 과목 평균 : " + avg);
		if (avg < 0 || avg > 100) {
			System.out.println("잘못된 입력 값입니다.");
		}
		else if (avg >= 90 || avg <=100) {
			System.out.println("평균 : " + avg + ", 등급 : A");
		}
		else if (avg >= 80) {
			System.out.println("평균 : " + avg + ", 등급 : B");
		}
		else if (avg >= 70) {
			System.out.println("평균 : " + avg + ", 등급 : C");
		}
		else if (avg < 70 || avg > 0) {
			System.out.println("평균 : " + avg + ", 등급 : D");
		}
		else {
			System.out.println("다시 입력해 주세요.");
		}
		
		scan.close();
	}

}
