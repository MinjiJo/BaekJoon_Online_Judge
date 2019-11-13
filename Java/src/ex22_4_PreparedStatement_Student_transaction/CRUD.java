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
		System.out.println("번호\t이름\t국어\t수학\t영어\t총점\t평균\t학점");
	}

	private static void selectAll(DAO dao) {
		ArrayList<Student> data = dao.selectAll();
		if (data.size() != 0) {
			printTitle();
			for (Student s : data) {
				System.out.println(s.toString());
			}
		} else {
			System.out.println("테이블에 데이터가 없습니다.");
		}
	}

	private static void delete(Scanner sc, DAO dao) {
		System.out.print("삭제할 번호를 입력하세요>");
		int no = inputNumber(sc);
		int result = dao.delete(no);
		if (result == 1)
			System.out.println("삭제 되었습니다.");
		else {
			System.out.println("삭제가 되지 않았습니다.");
		}
	}

	private static void update(Scanner sc, DAO dao) {
		System.out.print("수정할 번호를 입력하세요>");
		int no = inputNumber(sc);
		System.out.print("이름을 입력하세요>");
		String name = sc.nextLine();
		System.out.print("국어점수를 입력하세요>");
		int kor = inputNumber(sc);
		System.out.print("수학점수를 입력하세요>");
		int math = inputNumber(sc);
		System.out.print("영어점수를 입력하세요>");
		int eng = inputNumber(sc);
		int result = dao.update(no, name, kor, math, eng);
		if (result == 1)
			System.out.println("수정이 되었습니다.");
		else {
			System.out.println("수정 중 오류가 발생했습니다.");
		}
	}

	private static void select(Scanner sc, DAO dao) {
		System.out.print("조회할 번호를 입력하세요>");
		int no = inputNumber(sc);
		Student st = dao.select(no);
		if (st != null) {
			printTitle();
			System.out.println(st.toString());
		} else {
			System.out.println("조회된 학생이 없습니다.");
		}
	}

	private static void insert(Scanner sc, DAO dao) {
		System.out.print("이름을 입력하세요>");
		String name = sc.nextLine();
		System.out.print("국어점수를 입력하세요>");
		int kor = inputNumber(sc);
		System.out.print("수학점수를 입력하세요>");
		int math = inputNumber(sc);
		System.out.print("영어점수를 입력하세요>");
		int eng = inputNumber(sc);

		int result = dao.insert(name, kor, math, eng);
		if (result == 1)
			System.out.println("삽입 되었습니다.");
		else {
			System.out.println("삽입 실패되었습니다.");
		}
	}

	private static int menuselect(Scanner sc) {
		String menus[] = { "입력", "조회", "수정", "삭제", "모두조회", "종료" };
		int input = 0;
		int lowNumber = 1;
		int hiNumber = 6;
		int i = 0;
		System.out.println("===========================================================");
		for (String menu : menus) {
			System.out.println(++i + "." + menu);
		}
		System.out.println("===========================================================");
		System.out.print("메뉴를 선택하세요>");
		while (true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= hiNumber && input >= lowNumber) {
					break;
				} else {
					System.out.print(lowNumber + "~" + hiNumber + " 사이의 숫자를 입력하세요>");
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요>");
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
				System.out.println("숫자로 입력하세요>");
			}
		}
		return input;
	}
}
