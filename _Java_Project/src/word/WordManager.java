package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordManager {
	
	private ArrayList<Word> list = new ArrayList<>();

	public void addWord() {
		list.add(new Word("dog", "강어지"));
		list.add(new Word("cat", "고양이"));
		list.add(new Word("rabbit", "토끼"));
		list.add(new Word("bird", "새"));
		list.add(new Word("mouse", "쥐"));
	}
	
	public void insertWord(Scanner scan) {
		Word w = new Word();
		System.out.println("단어 입력");
		w.setWord(scan.next());
		System.out.println("의미 입력");
		scan.nextLine(); // 뒷쪽에 들어갈 값의 공백제거
		w.setMean(scan.nextLine());
		list.add(w);
		System.out.println("등록 완료");
	}

	public void seaechWord(Scanner scan) {
		System.out.println("검색 단어 입력");
		String s = scan.next();
		for (Word tmp : list) {
			if (tmp.getWord().equals(s)) {
				System.out.println("검색 결과");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}

	public void modifyWord(Scanner scan) {
		System.out.println("수정 단어 입력");
		String s = scan.next();
		Word w = new Word(s);
		// 해당 클래스 중 word만 같아도 같은 클래스로 인식
		boolean res = list.remove(w);
		if (!res) {
			System.out.println("검색 단어가 없습니다.");
			return;
		}
		//값 다시 추가
		insertWord(scan);
	}
	
	public void printWord() {
		System.out.println(">>단어장<<");
		Collections.sort(list);
		for (Word word : list) {
			System.out.println(word);
		}
	}
	
	public void filePrint() throws IOException{
		// 파일로 출력
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		Collections.sort(list); // 단어명으로 오름차순 정렬
		String data = "";
		while (cnt < list.size()) { // 리스트가 모두 소진될 때 까지
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); // 줄바꿈
			data = sb.toString();
			cnt++;
		}
		System.out.println(data);
		fw.write(data);
		fw.close();
		
	}
	
}
