package sort;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		Random random = new Random();
		
		random.nextInt(100); //range:0~99
	}
	
	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	//퀵 정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left;				//왼쪽 커서
		int pr = right;				//오른쪽 커서
		int x = a[(pl + pr) / 2];	//피벗
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
	}
}
