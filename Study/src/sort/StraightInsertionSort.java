package sort;

public class StraightInsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[5000];
		
		for(int i  = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5000) + 1;
		}
		
		insertionSort(arr, 5000);
		
		for(int i  = 0 ; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
	
	
	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int imsi = a[i];
			for(j = i; j > 0 && a[j-1] > imsi; j--) {
				a[j] = a[j-1];
			}
			a[j] = imsi;
		}
	}
}