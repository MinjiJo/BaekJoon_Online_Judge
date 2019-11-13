package ex7_11_method_exception;

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
		//메소드 안에서 발생한 익셉션이 메소드 안에서 처리되지 못하면
		//메소드를 호출한 쪽으로 던져진다.
		return getTotal() / num.length;
	}

}
