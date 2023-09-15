package chap_20;

import java.util.TreeSet;

public class _03_Set_Ex2 {

	public static void main(String[] args) {
		/* 배열의 점수 중 가장 큰 점수와 가장 작은 점수를 출력
		 */
		int[] score = {80, 99, 48, 68, 58, 88, 77, 100};
		
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		
		// 가장 앞에 있는 값(first), 가장 뒤에 있는 값(last)
		System.out.println(set.first()); // 가장 앞
		System.out.println(set.last()); // 가장 뒤
		
		// headSet : 지정한 값 보다 작은 값 출력
		System.out.println(set.headSet(77));
		
		// tailSet : 지정한 값 보다 큰 값 출력
		System.out.println(set.tailSet(77));
		
		// subSet : 검색 범위 뒤쪽 값은 미포함
		System.out.println(set.subSet(70, 90)); // 70은 포함 90은 미포함
		
	}

}
