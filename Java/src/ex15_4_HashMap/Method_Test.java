package ex15_4_HashMap;

import java.util.*;

public class Method_Test {
	public static HashMap<String, Integer> max_min(int data[]) {
		/*
		Map<String, Integer> m = new HashMap<String, Integer>();
		int result[] = {data[0], data[0]};
		
		for(int i = 1; i < data.length; i++) {
			if(result[0] < data[i]) result[0] = data[i]; 
			if(result[1] > data[i]) result[1] = data[i];
		}
		m.put("최대값", result[0]);
		m.put("최대값", result[0]);
		return m;
		*/

		
		
		int max = data[0];
		int min = data[0];

		
		for(int i = 1; i<data.length; i++) {
			if(max<data[i]) {
				max = data[i]; 
			}
			
			if(min>data[i]) {
				min = data[i];
			}
		}
		
		int[] max_min = {max, min};
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("최대값", max_min[0]);
		m.put("최소값", max_min[1]);
		return m;

	}
	
	public static void main(String args[]) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요?");
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}
		
		HashMap<String, Integer> m = max_min(data);
		System.out.println("최대값 = " + m.get("최대값"));
		System.out.println("최소값 = " + m.get("최소값"));
		
		sc.close();
	}
}
