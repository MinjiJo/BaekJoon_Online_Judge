package ex14_1_Wrapper;

public class Wrapper8_auto_boxing_unboxing {
	public static void main(String args[]) {
		int n01 = 10;
		int n02;
		
		Integer obj01;	//obj01���Դ� �ּҰ��� ������ ���� �ʽ��ϴ�.
		
		//�ڽ� - �⺻�� ���� ��üȭ
		//int -> Integer
		Integer obj02 = new Integer(20);// Integer ��ü ����
		
		obj01 = n01;	// ���� �ڽ�(jdk 1.5�̻� ���� ����)
		//obj01 = new Integer(n01);//�ڽ�
		
		n02 = obj02; //���� �� �ڽ�
		//n02 = obj02.intValue();//��ڽ�
		
		System.out.println(n01);
		System.out.println(n02);
	}
}
