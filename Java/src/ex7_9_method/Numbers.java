package ex7_9_method;

public class Numbers {

	private int num[];

	Numbers(int num[]) {
		this.num = num;
	}
	
	int getTotal() {	// 합계를 구하는 메서드
		int total = 0;
		for (int cnt = 0; cnt < num.length; cnt++)
			total += num[cnt];
		return total;
	}

	int getAverage() {		// 평균을 구하는 메서드
		return getTotal() / num.length;
	}

}
