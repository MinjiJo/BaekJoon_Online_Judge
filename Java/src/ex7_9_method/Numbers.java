package ex7_9_method;

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
		return getTotal() / num.length;
	}

}
