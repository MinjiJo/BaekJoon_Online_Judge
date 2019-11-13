package ex5_4_do_while;
import java.util.Scanner;

public class DoWhileExample1_Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String operator, keep;
		
		System.out.println("두 수와 연산자(+, -, *, /, %)를 입력하세요>");
		
		do {System.out.print("수1>");
			a = sc.nextInt();
			System.out.print("수2>");
			b = sc.nextInt();
			System.out.print("연산자>");
			operator = sc.next();
			
			switch(operator) {
			case "+":
				System.out.println(a+operator+b+"="+(a+b));
				break;
			case "-":
				System.out.println(a+operator+b+"="+(a-b));
				break;
			case "*":
				System.out.println(a+operator+b+"="+(a*b));
				break;
			case "/":
				double result = (double)(a)/b;
				System.out.println(a+operator+b+"="+result);
				break;
			case "%":
				System.out.println(a+operator+b+"="+(a%b));
				break;
			default:
				System.out.println("+, -, *, /, % 중 한 개를 입력하세요>");
			}
			
			System.out.println("계속 입력하시겠습니까?(N(n)이면 종료)>");
			keep = sc.next();
			
		} while (!(keep.equals("N")||keep.equals("n")));
		
		System.out.println("끝.");
		sc.close();
	}
} 
