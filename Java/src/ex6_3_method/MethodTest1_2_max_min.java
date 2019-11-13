package ex6_3_method;

import java.util.Scanner;

public class MethodTest1_2_max_min {
	public static void main(String args[]) {
		int data[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요>");
			for(int i = 0; i < data.length; i++)
				data[i] = sc.nextInt();
			
			int[] result = max_min(data);
			
			System.out.println("최댓값 = " + result[0]);
			System.out.println("최솟값 = " + result[1]);
			
			sc.close();
	}
	
	public static int[] max_min(int data[]) { //매개변수 항상 자료형으로!

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
		return max_min;

	}
}
