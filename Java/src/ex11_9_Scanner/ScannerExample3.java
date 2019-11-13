package ex11_9_Scanner;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		int num = sc.nextInt();
		System.out.println(num);
		
		String m = sc.nextLine();
		//String m = sc.next();
		System.out.println("읽어들인 데이터 길이 = " + m.length());
		sc.close();
	}
}
