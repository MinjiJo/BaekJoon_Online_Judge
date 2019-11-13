package ex6_1_array;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] data = {20, 30, 40, 80, 10 };
		//처음 두 개의 데이터를 비교한 후 최대값과 최소값을 구해 max, min을 초기화 합니다.
		int max = data[0]>data[1]?data[0]:data[1];
		int min = data[0]<data[1]?data[0]:data[1];
		
		//세번째 데이터, 인덱스 2인 데이터 부터 비교 합니다.
		for (int i = 2; i < data.length; i++) {
			if (max < data[i]) max = data[i];
			if (min > data[i]) min = data[i];
		}
		/*
		 for (int i = 2; i < data.length; i++){
		 	max = (max > data[i]) ? max : data[i];
		 */
		
		System.out.println("최대값 = " + max + "\n최소값 = " + min);
	}
}
