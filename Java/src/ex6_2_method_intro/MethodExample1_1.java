package ex6_2_method_intro;

public class MethodExample1_1 {
	//����������	��ü�������ص����డ��	��ȯ��		�޼����̸�(�Ű����� ���)
	public		static	 		void		main(String args[]) {
		//�޼��� ȣ�� ���1 - Ŭ������.�����޼���(static�� �ִ� ��찡 �����޼����� ��)
		MethodExample1_1.printCharacter('*', 30);//�޼��� ȣ��
		MethodExample1_1.printCharacter('-', 30);//�޼��� ȣ��
		System.out.println("Hello, Java");
		MethodExample1_1.printCharacter('-',  30);
		MethodExample1_1.printCharacter('*', 30);
		
		//�޼��� ȣ�� ���2
		printCharacter('*', 30);
		printCharacter('-', 30);//����
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		printCharacter('*', 30);
		return;//��ȯ���� void�� ��� ���������մϴ�.
	}
	
	//�޼��� ����
	public static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println();
		return; //��ȯ���� void�� ��� ���� �����մϴ�.
	}
}
