//단행본 클래스와 부록 CD 클래스를 사용하는 프로그램
package ex8_15_2_interface_polymorphism;

class InterfaceExample {
	public static void main(String[] args) {
		// int[] a = new int[3];
		// String[] a = new String[3];
		Lendable arr[] = new Lendable[3]; // 인터페이스 타입의 배열

		// 배열에 여러 타입의 객체 주소 저장
		arr[0] = new SeparateVolume("883ㅇ", "푸코의 진자", "에코");
		arr[1] = new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍", "유시진");

		checkOutAll(arr, "수지", "2019-02-28");
	}

	// 자바 컴파일러는 컴파일 할 때 변수의 타입만 보고 메소드나
	// 필드의 존재 여부를 체크하기 때문에
	// Lendable 인터페이스에 checkOut 메소드가 있어야 컴파일 에러가 없습니다.
	static void checkOutAll(Lendable arr[], String borrower, String date) {
		// 배열의 모든 항목에 대해 checkOut 메소드 호출
		arr[0].checkOut(borrower, date);
		arr[1].checkOut(borrower, date);
		arr[2].checkOut(borrower, date);

		/*
		 * for(int cnt = 0; cnt < arr.length; cnt++) arr[cnt].checkOut(borrower, date);
		 */

		/*
		 * for(Lendable a : arr){ a.checkOut(borrower, date); }
		 */
	}
}
