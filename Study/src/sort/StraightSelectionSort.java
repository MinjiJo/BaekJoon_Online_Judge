package sort;

public class StraightSelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[5000];
		int[] arr2 = new int[5000];
		
		for(int i  = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5000) + 1;
			arr2[i] = arr[i];
		}
		
		selectionSort(arr2, 5000);
		
		for(int i  = 0 ; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i] + ", arr2[" + i + "]=" + arr2[i]);
		}
	}
	
	
	static void selectionSort(int[] a, int n) {		
		
		for(int i = 0; i < a.length; i++) {
			int min = a[a.length - i -1];
			for(int j = a.length - 1; j > 0; j--) {
				if(a[j] < min) {
					int imsi = a[j];
					a[j] = min;
					min = imsi;
				}
			}
		}
		
	}
}
