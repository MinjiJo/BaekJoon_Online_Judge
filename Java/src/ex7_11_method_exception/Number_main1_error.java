//Numbers ��ü�� �޼ҵ尡 �ͼ����� �߻��ϴ� ���� �����ִ� ���α׷�
//0���� ���� ��� ���� �߻� - java.lang.ArithmeticException
package ex7_11_method_exception;

public class Number_main1_error {
	public static void main(String args[]) {
		int arr[] = new int[0];			// ���̰� 0�� �迭�� ����
		Numbers obj = new Numbers(arr);
		int average = obj.getAverage();	//�� �޼ҵ� �ȿ��� �ͼ����� �߻�
		System.out.println("��� = " + average);
	}
}
