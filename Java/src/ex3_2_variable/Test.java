package ex3_2_variable;

public class Test {
	public static void main(String[] args) {
		//1. ������ ���� age�� �ڽ��� ���̸� �����մϴ�.
		byte age = 20;
		
		//��¹�)
		//2. �� ���̴� 20�Դϴ�.
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		
		//3. �ϳ��� ���� �� ���̴� �� ���� �����߽��ϴ�.
		//���� �߻�-Type mismatch: cannot convert from int to byte
		age = (byte) (age + 1);
		
		//��¹�)
		//4. �� ���̴� 21�Դϴ�.
		System.out.println("�� ���̴� " + age + "�Դϴ�.");		
	}
}
