package ex6_2_method_intro;

public class MethodExample1_2_1 {

	//����������	��ü�������ص����డ��	��ȯ��		�޼����̸�(�Ű����� ���)
		public		static	 		void		main(String args[]) {
			sum(10);
			sum(100);
			sum(1000);
		}
		
		public static void sum(int num) {
			
			int num2 = 0;
			for(int i = 1; i <= num; i++) {
				num2 += i;
			}
			
			System.out.println("��(1~" + num + ") : " + num2);
			return; //void������ return ���� ����
		}
}
