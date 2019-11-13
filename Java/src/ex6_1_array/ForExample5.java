package ex6_1_array;

public class ForExample5 {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		
		/*
		for (int num = 0; num<arr.length; num++)
			System.out.println(arr[num]);
		*/
		//향상된 for문
		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println("Done.");
	}
}
