package chap_20;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class _02_Set_Ex1 {

	public static void main(String[] args) {
		/* set 중복저장x
		 * set에 로또번호 6개 성성 후 출력
		 * 랜덤으로 1~45
		 * 
		 * Math 클래스에서 제공하는 랜덤 메서드 사용
		 */
		
		// Random class 별도로 있음.
		// 1 ~ 45까지 랜덤수 출력
		
		HashSet<Integer> set = new HashSet<>();
		
		// 6번 생성x 6개가 중복없이 생성되어 찰때까지
		int size = 6;
		while (set.size() < 6) {
			int random = new Random().nextInt(45) + 1; // (45) = 개수 +1; = 1부터 45개
			set.add(random);
		}
		for (Integer s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 오름차순 : set, map은 순서가 없기 때문에 정렬이 안됨.
		// set 중 정렬이 되는 Set => TreeSet
		
		TreeSet<Integer> tree = new TreeSet<>();
		while (tree.size() < 6) {
			int random = new Random().nextInt(45) + 1;
			tree.add(random);
		}
		System.out.println(tree);
	}

}
