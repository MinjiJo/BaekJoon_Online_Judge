package ex17_4_Runnable_Interface;

public class MultithreadExample {
	public static void main(String[] args) {
		//Runnable �������̽��� �����ϴ� Ŭ������ ��ü�� �����ؼ�
		//Thread �������� �Ķ���ͷ� ���
		Thread thread = new Thread(new SmallLetters());//������ ����
		thread.start();
		char arr[] = {'��', '��', '��', '��', '��', '��', '��',
					  '��', '��', '��', '��', '��', '��', '��'};
		for (char ch : arr)
			System.out.print(ch);
	}
}
