package ex4_3_Operator;

public class Oper1 {
	public static void main(String args[]) {
		int a = 10, b = 4, c;
		c = a + b;			// c=14;
		System.out.println(a + "+" + b + "=" + c);
		
		c = a - b;			// c=6;
		System.out.println(a + "-" + b + "=" + c);
		
		c = a * b;			// c=40;
		System.out.println(a + "*" + b + "=" + c);
		
		c = a / b;			// c=2;
		System.out.println(a + "/" + b + "=" + c);
		
		c = a % b;			// c=2(나머지);
		System.out.println(a + "%" + b + "=" + c);
		
		System.out.printf("%d%%%d=%d", a, b, c);
		
		// a/b = 2.5를 만들어 봅시다.
		// 여러분이 해보세요
		
		System.out.println("\n\na/b = " + a/b);
		System.out.println("(double)(a/b) = " + (double)(a/b));
		System.out.println("(double)a = " + (double)a);
		System.out.println("(double)a/b = " + (double)a/b);
		System.out.println("a/(double)b = " + a/(double)b);
		System.out.println("(double)a/(double)b = " + (double)a/(double)b);
		System.out.println(a + "/" + b + "=" + (double)a/b);
		
		double d;
		d = (double)a/b;
		System.out.println(a + "/" + b + "=" +d);
		
	}
}
