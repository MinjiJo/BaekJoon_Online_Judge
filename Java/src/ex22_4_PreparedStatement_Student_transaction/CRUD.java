package ex22_4_PreparedStatement_Student_transaction;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			case 2:
				select(sc, dao);
				break;
			case 3:
				update(sc, dao);
				break;
			case 4:
				delete(sc, dao);
				break;
			case 5:
				selectAll(dao);
				break;
			case 6:
				return;
			}
		} while (true);
	}

	private static void printTitle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
	}

	private static void selectAll(DAO dao) {
		ArrayList<Student> data = dao.selectAll();
		if (data.size() != 0) {
			printTitle();
			for (Student s : data) {
				System.out.println(s.toString());
			}
		} else {
			System.out.println("���̺� �����Ͱ� �����ϴ�.");
		}
	}

	private static void delete(Scanner sc, DAO dao) {
		System.out.print("������ ��ȣ�� �Է��ϼ���>");
		int no = inputNumber(sc);
		int result = dao.delete(no);
		if (result == 1)
			System.out.println("���� �Ǿ����ϴ�.");
		else {
			System.out.println("������ ���� �ʾҽ��ϴ�.");
		}
	}

	private static void update(Scanner sc, DAO dao) {
		System.out.print("������ ��ȣ�� �Է��ϼ���>");
		int no = inputNumber(sc);
		System.out.print("�̸��� �Է��ϼ���>");
		String name = sc.nextLine();
		System.out.print("���������� �Է��ϼ���>");
		int kor = inputNumber(sc);
		System.out.print("���������� �Է��ϼ���>");
		int math = inputNumber(sc);
		System.out.print("���������� �Է��ϼ���>");
		int eng = inputNumber(sc);
		int result = dao.update(no, name, kor, math, eng);
		if (result == 1)
			System.out.println("������ �Ǿ����ϴ�.");
		else {
			System.out.println("���� �� ������ �߻��߽��ϴ�.");
		}
	}

	private static void select(Scanner sc, DAO dao) {
		System.out.print("��ȸ�� ��ȣ�� �Է��ϼ���>");
		int no = inputNumber(sc);
		Student st = dao.select(no);
		if (st != null) {
			printTitle();
			System.out.println(st.toString());
		} else {
			System.out.println("��ȸ�� �л��� �����ϴ�.");
		}
	}

	private static void insert(Scanner sc, DAO dao) {
		System.out.print("�̸��� �Է��ϼ���>");
		String name = sc.nextLine();
		System.out.print("���������� �Է��ϼ���>");
		int kor = inputNumber(sc);
		System.out.print("���������� �Է��ϼ���>");
		int math = inputNumber(sc);
		System.out.print("���������� �Է��ϼ���>");
		int eng = inputNumber(sc);

		int result = dao.insert(name, kor, math, eng);
		if (result == 1)
			System.out.println("���� �Ǿ����ϴ�.");
		else {
			System.out.println("���� ���еǾ����ϴ�.");
		}
	}

	private static int menuselect(Scanner sc) {
		String menus[] = { "�Է�", "��ȸ", "����", "����", "�����ȸ", "����" };
		int input = 0;
		int lowNumber = 1;
		int hiNumber = 6;
		int i = 0;
		System.out.println("===========================================================");
		for (String menu : menus) {
			System.out.println(++i + "." + menu);
		}
		System.out.println("===========================================================");
		System.out.print("�޴��� �����ϼ���>");
		while (true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= hiNumber && input >= lowNumber) {
					break;
				} else {
					System.out.print(lowNumber + "~" + hiNumber + " ������ ���ڸ� �Է��ϼ���>");
				}
			} catch (Exception e) {
				System.out.println("���ڷ� �Է��ϼ���>");
			}
		}
		return input;
	}

	private static int inputNumber(Scanner sc) {
		int input = 0;
		while (true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� �Է��ϼ���>");
			}
		}
		return input;
	}
}
