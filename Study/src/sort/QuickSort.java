package sort;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		Random random = new Random();
		
		random.nextInt(100); //range:0~99
	}
	
	//�迭 ��� a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	//�� ����
	static void quickSort(int[] a, int left, int right) {
		int pl = left;				//���� Ŀ��
		int pr = right;				//������ Ŀ��
		int x = a[(pl + pr) / 2];	//�ǹ�
		
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
