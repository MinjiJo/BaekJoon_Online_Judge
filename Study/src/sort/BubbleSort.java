package sort;
import java.lang.Math;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[5000];
		
		for(int i  = 0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5000) + 1;
		}
		
		bubbleSort(arr, 5000);
		
		for(int i  = 0 ; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
	
	//���� ����
	static void bubbleSort(int[] a, int n) {
		while(true) {
			
		}
	}
}