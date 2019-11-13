package ex6_3_method;

public class MethodTest2_1_Primative_change {
	
	public static void change(int n1, int n2) {
		int imsi = n1;
		n1 = n2;
		n2 = imsi;
	}
	
	public static void main(String a[]) {
		int n1 = 10, n2 = 20;
		System.out.println("change 호출 전 입니다.");
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		
		change(n1, n2);
		System.out.println("change 호출 후 입니다.");
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
	}
}
