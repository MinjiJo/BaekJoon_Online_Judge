package ex11_9_Scanner;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>");
		int num = sc.nextInt();
		System.out.println(num);
		
		String m = sc.nextLine();
		//String m = sc.next();
		System.out.println("�о���� ������ ���� = " + m.length());
		sc.close();
	}
}
