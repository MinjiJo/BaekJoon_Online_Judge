//���� �޼ҵ带 �����ϴ� Ŭ����
package ex7_15_static_method;

public class Accumulator {
	int total = 0;
	static int grandTotal = 0;		//���� �ʵ带 �����ϴ� ����
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	/*
	 * ���� �޼��� �ȿ����� �ν��Ͻ� ����, �ν��Ͻ� �޼��� ����� �� �����ϴ�.
	 * �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü ������ ����� �� �ִ� ������̱� ������
	 * �ν��Ͻ� ������ ���þ��� static �޼��� �ȿ����� ����� �� �����ϴ�.
	 * ���� this�� ����� �� �����ϴ�.
	 */
	
	static int getGrandTotal() {	// ���� �޼��� ����
		//total = 5;					// ���� �߻�
		//accumulate(200);				// ���� �߻�
		return grandTotal;
	}
}
