package ex5_4_do_while;
import java.util.Scanner;

public class DoWhileExample1_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String area;
				
		do {
			System.out.print("�����Է�(exit=q)>");
			area = sc.next();
			
			switch (area) {
			case "����":
			case "�λ�":
			case "����":
			case "�뱸":
				System.out.println(area+"�Դϴ�.");
				break;
			case "q":	//�� case���� ���� ��� "q"�� �Է��ϸ� "�׿� �����Դϴ�." ���
				break;
			default:
				System.out.println("�׿� �����Դϴ�.");
			}
		} while (!area.equals("q"));
		
		System.out.print("��");
			
			sc.close();
		}
}