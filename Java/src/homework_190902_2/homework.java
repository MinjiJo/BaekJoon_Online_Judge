package homework_190902_2;
import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		/* 1��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num = sc.nextInt();
		System.out.println(num / 10);
		*/
		
		/* 2��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num = sc.nextInt();
		System.out.println((num-1) / 10);
		*/
		
		/* 3��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num = sc.nextInt();
		System.out.println(((num-1) / 10) * 10);
		*/
		
		/* 4��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num = sc.nextInt();
		System.out.println((((num-1) / 10) * 10) + 1);
		*/
		
		/* 5��
		Scanner sc = new Scanner(System.in);
		System.out.println("page�� �Է��ϼ���:");
		int page = sc.nextInt();
		int startpage = (((page-1) / 10) * 10) + 1;
		System.out.println("startpage=" + startpage);
		*/
		
		// 6��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("limit�� �Է��ϼ���:");
		int limit = sc.nextInt();
		
		System.out.print("listcount�� �Է��ϼ���:");
		int list = sc.nextInt();
		
		int maxpage = ((list-1) / limit) + 1;
		System.out.println("maxpage=" + maxpage);
		
		sc.close();
		
	}
}
