package chap_08;

import java.util.Scanner;

public class _08_String_Ex1 {

	public static void main(String[] args) {
		/*
		 * 5개의 파일명이 주어졌을때, 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 */
		String[] fileName = { "java의 정석.txt", "이것이자바다.java", "String.jpg", "String 메서드.txt", "String 함수.java" };
		// ex) java => java의 정석.txt, 이것이자바다.java
		// ex) txt => java의 정석.txt, String 메서드.txt

		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력 하세요.");
		String file = scan.next();
		System.out.println();
		int cnt = 0;
		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].contains(file)) {
				System.out.printf("[%s] ", fileName[i]);
				cnt++;
			}
		}
		if (cnt == 0) { // 검색된 값의 갯수가 없다면
			System.out.println("검색 결과가 없습니다.");
		}
		
		
	}

}
