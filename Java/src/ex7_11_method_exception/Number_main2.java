//�޼ҵ尡 ������ ������ �ͼ����� ó���ϴ� ���α׷�
package ex7_11_method_exception;

public class Number_main2 {
	public static void main(String args[]) {
		int arr[] = new int[0];			// ���̰� 0�� �迭�� ����
		Numbers obj = new Numbers(arr);
		try {	// ������ �߻��� �� �ִ� ���� �־���
			int average = obj.getAverage();
			System.out.println("��� = " + average);
		}
		catch(ArithmeticException e) {
			System.out.println("����� ����ϴ� ���� ������ �߻��߽��ϴ�.");
		}
		
	}
}
