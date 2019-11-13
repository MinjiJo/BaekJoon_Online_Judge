package ex11_5_Calendar;
public class Calendar3_2_Today {
	public static void main(String[] args) {
		System.out.println("===== 오늘의 날짜 =====");
		Today t = new Today();
		System.out.println(t); // 원래 출력문 구문에선 t.toString()으로 와야 하는데 없으면 컴파일러가 자동으로 붙여주는 것
	}
}
