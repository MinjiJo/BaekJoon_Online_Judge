package homework_190902_1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] hs = null;

		while (true) {
			System.out.print("1.입력\n2.번호 조회\n3.모두 조회\n4.종료\n메뉴를 선택하세요>");
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
				System.out.print("숫자로 입력하세요>");
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
				System.out.print("1~4사이의 숫자를 입력하세요~>");
			}
		}
	}

	static Student[] inputStudent(Scanner a) {
		System.out.print("입력할 사람은 몇 명입니까?");
		int num = inputNumber(a);
		Student hs[] = new Student[num];

		for (int i = 0; i < hs.length; i++) {
			System.out.print("이름을 입력하세요>");
			String name = a.next();

			System.out.print("국어점수를 입력하세요>");
			a.nextLine();
			int kor = inputNumber(a);

			System.out.print("수학점수를 입력하세요>");
			int math = inputNumber(a);

			System.out.print("영어점수를 입력하세요>");
			int eng = inputNumber(a);

			hs[i] = new Student(i + 1, name, kor, math, eng);
		}
		return hs;
	}

	static void selectAll(Student[] hs) {
		if (hs != null) {
			System.out.print(hs);
		} else {
			System.out.print("입력 후 조회하세요~");
		}
	}

	static void select(Scanner sc, Student[] hs) {
		System.out.print("조회할 번호를 입력하세요>");
		int n = sc.nextInt();
		sc.nextLine();
		if (n > 0 && n <= hs.length) {
			System.out.print(hs[n - 1]);
		} else if (hs[n - 1] == null) {
			System.out.print("조회할 번호는 존재하지 않습니다.");
		} else {
			System.out.print("입력 후 조회하세요~");
		}
	}

	static void close(Scanner sc) {
		sc.close();
		System.out.print("프로그램 종료합니다.");
	}

	static void printTitle() {
		System.out.print("===============    학생별   /  과목별  총점  평균  구하기  ==============\n");
		System.out.print("번호\t이름\t국어\t수학\t영어\t총점\t평균\n");
	}

	static void printTail() {
		System.out.println("===========================================================");
		System.out.print("\t총점\t");
		System.out.println(Student.korTotal + "\t" + Student.mathTotal + "\t" + Student.engTotal);
	}
}
