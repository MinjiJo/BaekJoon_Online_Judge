//new�� ���� �迭�� �ڵ� �ʱ�ȭ - int�� : 0, double�� : 0.0
package ex6_1_array;

public class ArrayExample2 {
	public static void main(String args[]) {
		int arr[]; // �迭 ���� ����
		arr = new int[10]; // �迭 ���� : ������ ���ÿ� �ڵ������� �ڽ��� Ÿ�Կ�
						   // �ش��ϴ� �⺻������ �ʱ�ȭ �˴ϴ�.
		
		for(int i = 0; i <=9; i++)
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		
		// arr.length:�迭�� ũ��
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		
		/*
		 * ���� �߻� java.lang.ArrayIndexOutOfBoundsException: 10
		 * 
		 * System.out.println(arr[10]);
		 * System.out.println(arr[arr.length]);
		 * 
		 */
		
		System.out.println(arr[10]);
		System.out.println(arr[arr.length]);
	}
}
