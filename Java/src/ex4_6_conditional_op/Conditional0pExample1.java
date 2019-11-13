package ex4_6_conditional_op;

public class Conditional0pExample1 {
	public static void main(String[] args) {
		int a = 20, b = 30, max, min;
		
		System.out.println(a > b ? a : b);
		
		max = a > b ? a : b;
		System.out.println("최대값 = " + max);
		
		min = !(a > b) ? a : b;
		System.out.println("최소값 = " + min);
	}
}
