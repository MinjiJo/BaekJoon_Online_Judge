package ex6_1_array;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] data = {20, 30, 40, 80, 10 };
		//ó�� �� ���� �����͸� ���� �� �ִ밪�� �ּҰ��� ���� max, min�� �ʱ�ȭ �մϴ�.
		int max = data[0]>data[1]?data[0]:data[1];
		int min = data[0]<data[1]?data[0]:data[1];
		
		//����° ������, �ε��� 2�� ������ ���� �� �մϴ�.
		for (int i = 2; i < data.length; i++) {
			if (max < data[i]) max = data[i];
			if (min > data[i]) min = data[i];
		}
		/*
		 for (int i = 2; i < data.length; i++){
		 	max = (max > data[i]) ? max : data[i];
		 */
		
		System.out.println("�ִ밪 = " + max + "\n�ּҰ� = " + min);
	}
}
