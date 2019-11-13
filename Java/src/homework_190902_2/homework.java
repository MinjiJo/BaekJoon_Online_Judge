package homework_190902_2;
import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		/* 1번
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = sc.nextInt();
		System.out.println(num / 10);
		*/
		
		/* 2번
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = sc.nextInt();
		System.out.println((num-1) / 10);
		*/
		
		/* 3번
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = sc.nextInt();
		System.out.println(((num-1) / 10) * 10);
		*/
		
		/* 4번
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = sc.nextInt();
		System.out.println((((num-1) / 10) * 10) + 1);
		*/
		
		/* 5번
		Scanner sc = new Scanner(System.in);
		System.out.println("page를 입력하세요:");
		int page = sc.nextInt();
		int startpage = (((page-1) / 10) * 10) + 1;
		System.out.println("startpage=" + startpage);
		*/
		
		// 6번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("limit을 입력하세요:");
		int limit = sc.nextInt();
		
		System.out.print("listcount를 입력하세요:");
		int list = sc.nextInt();
		
		int maxpage = ((list-1) / limit) + 1;
		System.out.println("maxpage=" + maxpage);
		
		sc.close();
		
	}
}
