package ex6_2_method_intro;

public class MethodExample1_2_3 {
	//����������	��ü�������ص����డ��	��ȯ��		�޼����̸�(�Ű����� ���)
	public		static	 		void		main(String args[]) {
		int result = sum(1, 10);
		System.out.println("��(1, 10) : " + result);
		
		result = sum(1, 100);
		System.out.println("��(1, 100) : " + result);
		
		result = sum(1, 1000);
		System.out.println("��(1, 1000) : " + result);
		
		System.out.println("��(1, 10) : " + sum(1, 10));
		System.out.println("��(1, 100) : " + sum(1, 100));
		System.out.println("��(1, 1000) : " + sum(1, 1000));
	}
	//			    ��ȯ��
	public static int sum(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		/*	System.out.println("��("+start+","+end+") : " + sum);
			return;
		*/
		return sum;
	}
}
