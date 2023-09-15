package chap_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class _04_File4 {

	public static void main(String[] args) throws IOException {
		// map으로 저장하여 합계, 평균을 구하기.
		// put.txt
		
		BufferedReader br = new BufferedReader(new FileReader("out2.txt"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int sum = 0;
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
			String name = line.substring(0, line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
			sum += score;
		}
		System.out.println(map);
		System.out.println("합계: " + sum + " / 평균: " + ((double)sum / map.size()));
		br.close();
		
	}

}
