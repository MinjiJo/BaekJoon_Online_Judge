package ex6_1_array;

public class ForExample7 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 20 }, { 30, 40 }, { 50 } };
		/*
		for(int a : arr[0]) {
			System.out.print(a+" ");
		} System.out.println();

		for(int b : arr[1]) {
			System.out.print(b+" ");
		} System.out.println();
		
		for(int c : arr[2]) {
			System.out.print(c+" ");
		} System.out.println();
		*/
		
		for (int[] a : arr) {
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("Done.");
	}
}