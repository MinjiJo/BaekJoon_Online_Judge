package ex7_11_method_exception;

public class Numbers {

	private int num[];

	Numbers(int num[]) {
		this.num = num;
	}
	
	int getTotal() {	// �հ踦 ���ϴ� �޼���
		int total = 0;
		for (int cnt = 0; cnt < num.length; cnt++)
			total += num[cnt];
		return total;
	}

	int getAverage() {		// ����� ���ϴ� �޼���
		//�޼ҵ� �ȿ��� �߻��� �ͼ����� �޼ҵ� �ȿ��� ó������ ���ϸ�
		//�޼ҵ带 ȣ���� ������ ��������.
		return getTotal() / num.length;
	}

}
