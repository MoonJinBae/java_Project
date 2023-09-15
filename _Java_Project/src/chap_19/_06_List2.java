package chap_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_List2 {
	private List<String> list = new ArrayList<String>();

	public List<String> addArr(String s) {
		list.add(s);
		return list;
	}
	public void printArr(List<String> add) {
		System.out.println(add);
	}
	
	public static void main(String[] args) {
		/* 두 배열을 매개변수로 입력받아서 하나로 합치는 ArrayList를 구성
		 * List = a b c d e f g h
		 */
		String arr1[] = new String[] {"a", "e", "c", "g"};
		String arr2[] = new String[] {"b", "f", "d", "h", "i"};
		
		_06_List2 add = new _06_List2();
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		String exit = "";
		while(!(exit.equals("n") || exit.equals("N"))) {
			System.out.println("단어 등록");
			String input = scan.next();
			list = add.addArr(input);
			System.out.println("계속 등록 하시려면 아무키나 누르세요. 종료 => [n /N]");
			exit = scan.next();
		}
		add.printArr(list);
		System.out.println(list.size()); // 사이즈
		System.out.println(list.contains("문진배")); // "문진배" 포함 체크
		// 합치기 => 정렬
//		List<String> list = new ArrayList();
//		for (int i = 0; i < arr1.length; i++) {
//			list.add(arr1[i]);
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			list.add(arr2[i]);
//		}
//		// 합치기
//		System.out.println(list);
//		
//		// Collections.sort() 정렬
//		Collections.sort(list);
//		System.out.println(list);
//		
//		// sort() 사용 정렬
//		list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2); // 오름차순
//			}
//		});
//		System.out.println(list);
		
	}

}
