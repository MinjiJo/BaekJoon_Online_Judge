package homework_190829;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_190829_answer {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// �⵵, �� ��� �ޱ�
		System.out.print("����� �⵵�� �Է��ϼ���>");
		int year = sc.nextInt();
		System.out.print("����� ���� �Է��ϼ���>");
		int month = sc.nextInt();
		sc.close();

		Calendar c = new GregorianCalendar(year, month - 1, 1);
		int lastday = c.getActualMaximum(Calendar.DATE);
		int s = c.get(Calendar.DAY_OF_WEEK);

		String yoil[] = { "��", "�� ", "ȭ ", "�� ", "��", "��", "��" };
		System.out.print("\t\t\t" + c.get(Calendar.YEAR) + "��  ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "��" + "\n ");
		for (int i = 0; i < yoil.length; i++) {
			System.out.print(yoil[i] + "\t");
		}
		System.out.println();
		// ������ �Ͽ����� ��� s=1 ���� ���� i= 1 2 3 4 5 6 7
		// ������ �������� ��� s=2 ���� �Ѱ� i= 0 1 2 3 4 5 6
		// ������ ȭ������ ��� s=3 ���� �ΰ� i=-1 0 1 2 3 4 5
		// ������ �������� ��� s=4 ���� ���� i=-2 -1 0 1 2 3 4
		// ������ ������� ��� s=5 ���� �װ� i=-3 -2 -1 0 1 2 3
		// ������ �ݿ����� ��� s=6 ���� �ټ��� i=-4 -3 -2 -1 0 1 2
		// ������ ������� ��� s=7 ���� ������ i=-5 -4 -3 -2 -1 0 1

		/*
		 int ii = 0;
		for (int i = 2 - s; i <= lastday; i++) { // s+i=2 => i=2-s
			if (i <= 0) {
				System.out.print("\t");
			} else {
				System.out.print(i + "\t");
			}
			ii++;
			if (ii % 7 == 0) {
				System.out.println("\n");
			}
		*/
		
		
		for (int i = 2 - s; i <= lastday; i++) { // s+i=2 => i=2-s
			if (i <= 0) {
				System.out.print("\t");
			} else {
				System.out.print(i + "\t");
			}
			
			// ������ �Ͽ����� ��� s=1	��� 1 2 3 4 5 6 7
			// ������ �������� ��� s=2	���     1 2 3 4 5 6
			// ������ �������� ��� s=3	���		1 2 3 4 5
			
			if ((i+s) % 7 == 1) {
				System.out.println("\n");
			}
		}
	}
}
