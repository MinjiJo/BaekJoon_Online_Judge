package ex3_2_variable;

public class Variable2 {
	public static void main(String[] args) {
		//������-s1, s2�� �޸� �ּ�, new�� ������,
		//new String("�ڹ�"); ���� String()�� ������
		String s1 = "�ڹ�";		// String�� JRE�� ����ִ� Ŭ����
		String s2 = new String("�ڹ�");//	 String�� ���̺귯���� �����Ǵ� Ŭ����
		System.out.println("s1=" + s1 + " s2=" + s2);
		
		// �ּҰ� ������ ��
		if (s1 == s2) {
			System.out.println("���� �ּ�");
		} else {
			System.out.println("�ٸ� �ּ�");
		}
		
		// ���밪 ������ ��
		if (s1.equals(s2)) {
			System.out.println("���� ��");
		} else {
			System.out.println("�ٸ� ��");
		}
	}
}
