package ex4_4_incre_dec;

public class IncrDecExample4 {
	public static void main(String[] args) {
		char a = 'A';		//'A'�� ���� �ڵ尪�� 65�� ���� a�� ����� ���Դϴ�.
		System.out.println(++a); //���� �ڵ��� ���� 1�����Ǿ� 66�� �ǰ�
								 //�� ���� Ÿ�Կ� ���� ����մϴ�.
		
		a--;
		System.out.println(a);
		
		char b = (char) (a+32);
		System.out.println(a+"=>"+b);
		
		a++;
		char c = (char) (a+32);
		System.out.println(a+"=>"+c);
		
	}
}
