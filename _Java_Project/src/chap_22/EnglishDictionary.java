package chap_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EnglishDictionary implements Comparable<EnglishDictionary> {

	private String word; // 단어
	private String mean; // 뜻

	public EnglishDictionary(String word, String meaning) {
		this.word = word;
		this.mean = meaning;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String meaning) {
		this.mean = meaning;
	}
	@Override
	public String toString() {
		return "단어(" + word + "), 뜻(" + mean + ")";
	}
	@Override
	public int compareTo(EnglishDictionary o) {
		// TODO Auto-generated method stub
		return word.compareTo(o.word);
	}
	public static void main(String[] args) throws IOException {
		/*
		 * 영어사전 메뉴 1.단어등록|2.단어검색|3.단어수정|4.단어출력|6.종료 파일로 저장 클래스 단어 구성(word, mean) 단어, 뜻
		 * 단어대로 오른차순 정렬
		 * 
		 * do 1.동사(어떤 동작이나 행위를) 하다 2.동사(앞에서 언급된 대로) 하다 3.동사 하다[되어 가다](어떤 성공 여부나 진행 상황에
		 * 대해 말하거나 물을 때 씀) 4.조동사(다른 동사 앞에 쓰여 부정문이나 의문문을 만듬) 5.조동사(부가 의문문을 만들때 쓰임)
		 * 
		 * 사전의 내용을 만들어 파일로 출력(저장)
		 */
		Scanner scan = new Scanner(System.in);
		
		EnglishDictionaryManager em = new EnglishDictionaryManager();
		FileWriter egd = new FileWriter("EnglishDictionary.txt"); // 파일저장 객체생성
		
		em.add();
		
		int menu = 0;
		do {
			System.out.println("메뉴 선택");
			System.out.println("1.단어등록 |2.단어검색 |3.단어수정");
			System.out.println("4.단어삭제 |5.단어출력 |6.종료");
			try {
				menu = scan.nextInt();
			} catch (InputMismatchException e) {
				scan = new Scanner(System.in);
			}
			switch (menu) {
			case 1:
				em.addWord(scan);
				break;
			case 2:
				em.searchWord(scan);
				break;
			case 3:
				em.updateWord(scan);
				break;
			case 4:
				em.deleteWord(scan);
				break;
			case 5:
				em.printWord();
				break;
			case 6:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못된 메뉴 입니다.");
				break;
			}
		} while (menu != 6);
		
		String data = em.wordList.toString(); // 문자열 변수에 매니저클래스 단어장리스트 저장
		egd.append(data); // 파일로 저장
		egd.close();
		
		BufferedReader br = new BufferedReader(new FileReader("EnglishDictionary.txt"));
		while (true) {
			String line = br.readLine(); // 한 라인씩 읽기
			if (line == null) {
				break; // 더이상 읽을 라인이 없다면 break;
			}
			System.out.println(line);
		}
		br.close();
	}
}

class EnglishDictionaryManager {

	List<EnglishDictionary> wordList = new ArrayList<>();

	void add() { // 기본 단어장
		wordList.add(new EnglishDictionary("Hello", "안녕"));
		wordList.add(new EnglishDictionary("Apple", "사과"));
		wordList.add(new EnglishDictionary("Peach", "복숭아"));
		wordList.add(new EnglishDictionary("Orange", "오렌지"));
		wordList.add(new EnglishDictionary("Lemon", "레몬"));
		
	}

	public void addWord(Scanner scan) {
		// 단어 추가
		System.out.println("단어 입력 >>");
		String word = scan.next();
		System.out.println("뜻 입력 >>");
		String mean = scan.next();
		wordList.add(new EnglishDictionary(word, mean));
	}

	public void deleteWord(Scanner scan) {
		// 단어 삭제
		int index = -1;
		System.out.println("단어 입력 >>");
		String word = scan.next();
		for (EnglishDictionary ed : wordList) {
			if (ed.getWord().equals(word)) {
				wordList.remove(ed);
				index++;
				return;
			}
		}
		if (index == -1) {
			System.out.println("없는 단어 입니다.");
		}
	}

	public void printWord() {
		// 단어장 출력
		Collections.sort(wordList); // 오름차순정렬
		for (EnglishDictionary ed : wordList) {
			System.out.println(ed);
		}
	}

	public void updateWord(Scanner scan) {
		// 단어장 수정
		System.out.println("1.단어 수정 |2.뜻 수정");
		int menu = 0;
		int index = -1;
		try {
			menu = scan.nextInt();
		} catch (InputMismatchException e) {
			scan = new Scanner(System.in);
		}
		switch (menu) {
		case 1:
			System.out.println("단어 입력");
			String word = scan.next();
			for (EnglishDictionary ed : wordList) {
				if (ed.getWord().equals(word)) {
					System.out.println("수정할 단어 입력 >>");
					word = scan.next();
					ed.setWord(word);
					System.out.println("뜻 입력 >>");
					String mean = scan.next();
					ed.setMean(mean);
					index++;
				}
			}
			if (index == -1) {
				System.out.println("없는 단어 입니다.");
			}
			break;
		case 2:
			System.out.println("단어 입력");
			word = scan.next();
			for (EnglishDictionary ed : wordList) {
				if (ed.getWord().equals(word)) {
					System.out.println("뜻 입력 >>");
					String mean = scan.next();
					ed.setMean(mean);
					index++;
				}
			}
			if (index == -1) {
				System.out.println("없는 단어 입니다.");
			}
			break;
		default:
			System.out.println("잘못된 메뉴 입니다.");
			break;
		}
	}

	public void searchWord(Scanner scan) {
		// 단어 검색
		int index = -1;
		System.out.println("단어 입력");
		String word = scan.next();
		for (EnglishDictionary ed : wordList) {
			if (ed.getWord().equals(word)) {
				System.out.println(ed);
				index++;
			}
		}
		if (index == -1) {
			System.out.println("없는 단어 입니다.");
		}
	}
}