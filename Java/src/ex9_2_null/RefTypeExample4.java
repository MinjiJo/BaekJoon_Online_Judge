//obj������ null�̶�� �������� �ֱ� ������ ������ ������ ������
//����� ���� �߻�(��Ÿ�� ���� �߻�)
package ex9_2_null;

class RefTypeExample4 {
	public static void main(String args[]) {
		Point obj = null;
		try {
			System.out.println(obj.x);
			System.out.println(obj.y);
		} catch (java.lang.NullPointerException n) { //Exception�� �θ��̱� ������ �ڽ��� ǰ� Exception n �̶�� �ᵵ ���ư�. ������ ����� ��!
			System.out.println("Point�� null �Դϴ�");
		}
	}
}
