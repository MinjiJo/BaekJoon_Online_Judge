//hundredNumbers를 이용하는 프로그램!
package ex7_17_static_int;

public class StaticInitializerExample1 {
	public static void main(String args[]) {
		System.out.println("main 실행시작");
		HundredNumbers h = new HundredNumbers();
		HundredNumbers h2 = new HundredNumbers();
		
		//배열에 있는 항목들 중 3개의 항목을 가져와서 그 값을 출력합니다.
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
	}
}
