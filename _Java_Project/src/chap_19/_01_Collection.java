package chap_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class _01_Collection {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스. 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신에 사용
		 * 
		 * List : 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장(index)
		 * - 중복 허용
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서 보장x(index 없음, 번지가 없음)
		 * - 중복허용x(같은 자료가 입력되면 버려짐)
		 * 
		 * Map
		 * - 값을 두개씩 저장 key / value 쌍으로 저장
		 * - key는 중복 불가능 / value는 중복 가능
		 * - key가 중복되면 value는 덮어쓰기 됨
		 * - 아이디 / 패스워드 와 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * 배열은 기본자료형, 클래스 자료형으로 구성가능
		 * int[] arr, String[] arr, Student[] arr
		 * collection에서는 기본자료형 사용x, class자료형으로만 구성 가능
		 * 
		 * int => Integer, String, 나머지 기본자료형들은 첫 글자만 대문자로 변경하면 클래스가 됨.(Byte, Boolean => 기본 자료형의 클래스들)
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨.
		 * -----------------------------------------------------------
		 * List<클래스형> 객체명 = new 구현클래스<클래스형>(); 
		 * List => 구현 클래스 ArrayList(검색이 많은 케이스)
		 *                / LinkedList(추가, 삭제가 많은 케이스)
		 * 
		 * ArrayList => 배열과 비슷한 자료구조 값을 등록하는 형태
		 * - 미리 길이를 지정하지 않음. 추가하면 늘어나고, 삭제되면 줄어드는 형태
		 * - 추가, 삭제가 쉽다
		 * 
		 * LinkedList => 값을 중간에 끼워넣기, 중간에서 빼기 형태가 쉽다
		 * - 검색이 느리다
		 */
		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList list3 = new ArrayList<>(); // 자료형이 Object가 됨.
		
		// add() : 요소를 추가하는 메서드
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list); // toString() 생략가능
		
		// size() : List의 총 개수
		System.out.println(list.size());
		
		// 문자열을 담을 수 있는 ArrayList 생성
		// 문자를 5개 저정한 후 출력
		// 총 개수가 몇개인지도 출력
		ArrayList<String> sArr = new ArrayList<String>();
		sArr.add("사과");
		sArr.add("포도");
		sArr.add("바나나");
		sArr.add("귤");
		sArr.add("딸기");
		System.out.println(sArr); 
		System.out.println(sArr.size());
		
		// 값을 하나씩 찍어보기
		// 값을 가져올 때 : get() / 값을 변경할 때 : set()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		
		// List 생성 후, 1 ~ 10 까지 저장한 후 출력
		List<Integer> num = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			num.add(i+1);
			System.out.print(num.get(i) + " ");
		}
		System.out.println();
		
		// set(index, 값) : 값을 변경할 때
		num.set(0, 7);
		System.out.println(num);
		
		// remove(index) : index 번지의 값을 삭제
		// remove(Object) : Object의 요소(값)를 삭제
		num.remove(0);
		System.out.println(num);
		
		Integer a = 9;
		num.remove(a); // 요소를 삭제
		System.out.println(num);
		
		// contains(Object) : List에 값이 있는지 검사 true / false로 리턴
		System.out.println(num.contains(a));
		
		// clear() : List 비움(요소 전부 삭제)
		num.clear();
		System.out.println(num);
		
		// isEmpty() : List가 비어있는지 체크 비어있으면 true
		System.out.println(num.isEmpty());
		
		// 리스트 생성 후, 1 ~ 10까지 채운 후 출력(for문 이용하여 요소를 꺼내서 출력)
		List<Integer> num2 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			num2.add(i + 1);
			System.out.printf("[%d]", num2.get(i));
		}
		System.out.println();
		
		// 요소에서 5를 삭제
		Integer five = 5;
		num2.remove(five);
		
		// 다시 출력 : 향상된 for문
		for (Integer i : num2) {
			System.out.printf("[%d]", i);
		}
		System.out.println();
		System.out.println("--------------------------");
		
		// Iterator : index가 없는 값을 출력하기 위해 사용
		/* List에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 번지에 접근이 가능
		 * Set / Map은 순서를 보장하지 않기 때문에 (일반)for문을 이용할 수 없음
		 * 향상된 for문, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문을 사용
		 * 향상된 for문 / Iterator 는 Map에서 직접 사용 불가능
		 */
		System.out.println("--Iterator 출력--");
		Iterator<Integer> it = num2.iterator();
		while(it.hasNext()) { // hasNext() 다음 요소가 있는지 체크 true / false
			Integer tmp = it.next(); // next() 다음 요소 가져오기
			System.out.print(tmp + " ");
		}
		System.out.println();
		// indexOf(값) : 해당 값이 List의 index를 반환 / 없다면 -1 리턴
		Integer n = 9;
		System.out.println(num2.indexOf(n)); // 7번째 index 리턴
		
		// List 생성 후, 값을 무작위로 10개만 추가
		num2.clear();
		num2.add(4);
		num2.add(2);
		num2.add(6);
		num2.add(7);
		num2.add(10);
		num2.add(1);
		num2.add(5);
		num2.add(9);
		num2.add(8);
		num2.add(3);
		System.out.println(num2);
		
		// Collections.sort() // 오름차순만 가능
//		Collections.sort(num2);
//		System.out.println(num2);
		
		// sort(comparator를 구현한 객체) : 정렬
		// 객체 : comparator 인터페이스를 구현한 객체를 넣어야 함(익명클래스 사용)
		// 비교(comparator) 메서드를 구현하여 객체를 정렬
		// compareTo : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		
		num2.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// compare 역할 : 결과가 (-)면 앞으로 보내고, (+)면 뒤로 보내는 역할
				// o1-o2 : 오름차순,   o2-o1 : 내림차순
				return o2 - o1;
			}
			
		});
		System.out.println(num2);
		
		
	}

}
