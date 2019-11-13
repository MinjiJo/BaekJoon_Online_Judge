//HundredNumbers를 이용하는 프로그램!
package ex7_17_static_int;

public class StaticInitializerExample2 {
	public static void main(String args[]) {
		System.out.println("main 실행시작");
		
		HundredNumbers2 h = new HundredNumbers2("호호");
		System.out.println(h.a);
	}
}
