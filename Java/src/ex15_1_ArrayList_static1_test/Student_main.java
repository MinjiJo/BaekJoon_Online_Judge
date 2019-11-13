package ex15_1_ArrayList_static1_test;

import java.util.ArrayList;

public class Student_main {
	public static void main(String args[]) {
		Student h1 = new Student("강호동", 85, 60, 70);
		Student h2 = new Student("이승기", 90, 95, 80);
		Student h3 = new Student("유재석", 75, 80, 100);
		Student h4 = new Student("하하", 80, 70, 95);
		Student h5 = new Student("이광수", 100, 65, 80);

		// ArrayList 생성 및 추가
		ArrayList<Student> as = new ArrayList<Student>();
		as.add(h1);
		as.add(h2);
		as.add(h3);
		as.add(h4);
		as.add(h5);

		Student.rank(as);
		Student.sort(as);
		print(as);
	}

	// 출력하기
	static void print(ArrayList<Student> as) {
		System.out.println("===========    학생별   /   과목별   총점   구하기    ===========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균\t등수");
		for (int i = 0; i < as.size(); i++) {
			System.out.print(as.get(i).toString());
		}
		for (int j = 0; j < 51; j++) {
			System.out.print("=");
		}
		
		System.out.print("\n총점\t");
		System.out.print(Student.korTotal+"\t");
		System.out.print(Student.mathTotal+"\t");
		System.out.print(Student.engTotal+"\t");
	}
}
