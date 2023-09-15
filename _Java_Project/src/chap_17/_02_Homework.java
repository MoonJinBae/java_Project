package chap_17;

import java.util.Scanner;

public class _02_Homework {
	
	private String[] saveFile = new String[5]; // 5개 파일 저장
	private String[] searchFileName = new String[saveFile.length]; // 파일 검색결과 저장
	private int cnt; // 검색결과 배열 카운트
	Scanner scan = new Scanner(System.in);
	public _02_Homework() {}
	
	public void saveFile() { // 5개 파일저장 메서드
		for (int i = 0; i < saveFile.length; i++) {
			System.out.println((i+1) + "번째 파일명을 입력 하세요.");
			String input = scan.next();
			saveFile[i] = input;
		}
		System.out.println("--이미지 파일 등록 완료--");
		System.out.println("---------------------------");
	}
	public void searchFile(String type) { // 검색결과 저장 메서드
		int count = 0;
		System.out.printf("[%s]형식 이미지파일 검색%n", type);
		for (int i = 0; i < saveFile.length; i++) {
			if (type.equals(saveFile[i].substring(saveFile[i].indexOf(".") + 1))) {
				searchFileName[cnt] = saveFile[i];
				System.out.println("검색결과[" + searchFileName[cnt] + "]");
				cnt++; // 배열등록 카운트
				count++; // 검색 결과 카운트
			}
		}
		if (count == 0) {
			System.out.println("해당 파일이 존재하지 않습니다.");
		}
		System.out.println("---------------------------");
	}

	public void printFile() { // 저장된 파일, 검색결과 파일 출력
		System.out.println("==현재 저장 파일==");
		for (String s : saveFile) {
			System.out.printf("[%s]", s);
		}
		System.out.println();
		System.out.println("==이미지 파일==");
		if (cnt == 0) {
			System.out.println("저장된 파일 없음");
		} else {
			for (int i = 0; i < cnt; i++) {
				System.out.printf("[%s]", searchFileName[i]);
			}
		}
		System.out.println();
		System.out.println("---------------------------");
	}
	
	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받기
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식(jpg, png, gif, jpeg)
		 * {"java.txt", "java.jpg", "method.png", "spring.pdf", "spring.gif"}
		 * java.txt java.jpg method.png spring.pdf spring.gif
		 * --이미지파일--
		 * java.jpg, method.png, spring.gif
		 */
		_02_Homework h = new _02_Homework();
		
		System.out.println("파일명 5개를 입력하세요.");
		h.saveFile();
		System.out.println("해당형식 이미지파일 검색(jpg, png, gif, jpeg)");
		h.searchFile("jpg");
		h.searchFile("png");
		h.searchFile("gif");
		h.searchFile("jpeg");
		h.printFile();
		
	}

}
