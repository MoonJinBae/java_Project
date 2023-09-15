package word;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * 1. 단어등록 |2. 단어검색 |3. 단어수정 |4. 단어출력 |5. 파일출력 |6. 종료
		 * 파일로 저장
		 * 파일명 word.txt
		 */
		Scanner scan = new Scanner(System.in);
		
		WordManager wm = new WordManager();
		wm.addWord();
		
		int menu = -1;
		do {
			System.out.println("1. 단어등록 |2. 단어검색 |3. 단어수정 |4. 단어출력 |5. 파일출력 |6. 종료");
			System.out.println("선택 >>");
			menu = scan.nextInt();
			try {
				switch (menu) {
				case 1:
					wm.insertWord(scan);
					break;
				case 2:
					wm.seaechWord(scan);
					break;
				case 3:
					wm.modifyWord(scan);
					break;
				case 4:
					wm.printWord();
					break;
				case 5:
					wm.filePrint();
					break;
				case 6:
					
					break;

				default: System.out.println("잘못된 메뉴 입니다.");
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (menu != 6);
	}

}
