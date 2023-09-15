package chap_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_MapEx1 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어를(5개) 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 */
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		System.out.println("단어장에 5개 단어를 입력 하세요.");
		int cnt = 5;
		while (map.size() < cnt) {
			System.out.println("단어 입력 >>");
			String input1 = scan.next();
			System.out.println("뜻 입력  >>");
			String input2 = scan.next();
			map.put(input1, input2);
		}
		System.out.println();
		System.out.println(map);
		
		for (String s : map.keySet()) {
			System.out.println("단어 => " + s + " , 뜻 => " + map.get(s));
		}
		for (Map.Entry<String, String> s : map.entrySet()) {
			System.out.println("단어 >> " + map.keySet() + " 뜻 >> " + map.values());
		}
		
		
		scan.close();
	}

}
