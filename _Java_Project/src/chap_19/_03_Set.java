package chap_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _03_Set {

	public static void main(String[] args) {
		/* Set 순서보장x, 중복x
		 * HashSet(대표적인 Set 컬렉션 구현 클래스) 
		 * TreeSet(정렬이 되는 Set)
		 * 순서가 없다. index가 없음.
		 */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		System.out.println(set);
		for (String tmp : set) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("-------------------------");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		// Set정렬 : set은 순서가 없어서 정렬이 안됨.
		// Set => List로 변환한 후 정렬
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
