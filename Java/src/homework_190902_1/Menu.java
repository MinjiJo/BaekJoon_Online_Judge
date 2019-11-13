package homework_190902_1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] hs = null;

		while (true) {
			System.out.print("1.�Է�\n2.��ȣ ��ȸ\n3.��� ��ȸ\n4.����\n�޴��� �����ϼ���>");
			switch (selectMenu(sc)) {
			case 1:
				inputStudent(sc);
				break;
			case 2:
				select(sc, hs);
				break;
			case 3:
				selectAll(hs);
				break;
			case 4:
				close(sc);
				break;
			}
		}
	}

	static int inputNumber(Scanner a) {
		while (true) {
			try {
				String s = a.nextLine();
				int num = Integer.parseInt(s);
				return num;
			} catch (Exception e) {
				System.out.print("���ڷ� �Է��ϼ���>");
			}
		}
	}

	static int selectMenu(Scanner a) {

		while (true) {
			try {
				int n = inputNumber(a);
				if (n >= 1 && n <= 4)
					return n;
			} catch (Exception e) {
				System.out.print("1~4������ ���ڸ� �Է��ϼ���~>");
			}
		}
	}

	static Student[] inputStudent(Scanner a) {
		System.out.print("�Է��� ����� �� ���Դϱ�?");
		int num = inputNumber(a);
		Student hs[] = new Student[num];

		for (int i = 0; i < hs.length; i++) {
			System.out.print("�̸��� �Է��ϼ���>");
			String name = a.next();

			System.out.print("���������� �Է��ϼ���>");
			a.nextLine();
			int kor = inputNumber(a);

			System.out.print("���������� �Է��ϼ���>");
			int math = inputNumber(a);

			System.out.print("���������� �Է��ϼ���>");
			int eng = inputNumber(a);

			hs[i] = new Student(i + 1, name, kor, math, eng);
		}
		return hs;
	}

	static void selectAll(Student[] hs) {
		if (hs != null) {
			System.out.print(hs);
		} else {
			System.out.print("�Է� �� ��ȸ�ϼ���~");
		}
	}

	static void select(Scanner sc, Student[] hs) {
		System.out.print("��ȸ�� ��ȣ�� �Է��ϼ���>");
		int n = sc.nextInt();
		sc.nextLine();
		if (n > 0 && n <= hs.length) {
			System.out.print(hs[n - 1]);
		} else if (hs[n - 1] == null) {
			System.out.print("��ȸ�� ��ȣ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("�Է� �� ��ȸ�ϼ���~");
		}
	}

	static void close(Scanner sc) {
		sc.close();
		System.out.print("���α׷� �����մϴ�.");
	}

	static void printTitle() {
		System.out.print("===============    �л���   /  ����  ����  ���  ���ϱ�  ==============\n");
		System.out.print("��ȣ\t�̸�\t����\t����\t����\t����\t���\n");
	}

	static void printTail() {
		System.out.println("===========================================================");
		System.out.print("\t����\t");
		System.out.println(Student.korTotal + "\t" + Student.mathTotal + "\t" + Student.engTotal);
	}
}
