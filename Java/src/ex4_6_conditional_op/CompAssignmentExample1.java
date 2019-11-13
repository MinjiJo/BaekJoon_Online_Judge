package ex4_6_conditional_op;

public class CompAssignmentExample1 {
	public static void main(String[] args) {
		int res=10, a=2;
		res += a;	//res = res + a;	//12
		System.out.println(res);
		
		res -= a;	//res = res - a;	//10
		System.out.println(res);
		
		res *= a;	//res = res * a;	//20
		System.out.println(res);
		
		res /= a;	//res = res / a;	//10
		System.out.println(res);
		
		int num = 29;
		num -= 2 + 3 * 4;//num = num - (2 + 3 * 4) 와 똑같은 효과를 갖는 대입문
		System.out.println(num);
	}
}
