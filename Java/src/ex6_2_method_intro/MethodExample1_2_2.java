package ex6_2_method_intro;

public class MethodExample1_2_2 {

	//����������	��ü�������ص����డ��	��ȯ��		�޼����̸�(�Ű����� ���)
			public		static	 		void		main(String args[]) {
				sum(1, 10);
				sum(1, 100);
				sum(1, 1000);
			}
			
			public static void sum(int start, int end) {
				
				int sum = 0;
				for(int i = start; i <= end; i++) {
					sum += i;
				}
					System.out.println("��("+start+","+end+") : " + sum);
					return;
				
			}
}
