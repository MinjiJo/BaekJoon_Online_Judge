package homework;
import java.util.Scanner;

public class Homework_190816_answer {
	
	public static void main(String[] args) {
		
		System.out.print("3���� ������ �Է��ϼ���>");
		int n1, n2, n3, max, min;
		
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;
		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println(n1 + "," + n2 + "," + n3 + " �� ū ���� " + max + "�Դϴ�.");
		System.out.println(n1 + "," + n2 + "," + n3 + " �� ���� ���� ���� " + min + "�Դϴ�.");
		sc.close();
	}
}