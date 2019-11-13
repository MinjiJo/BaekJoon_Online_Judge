package ex18_7_student;

import java.util.*;
import java.io.*;

public class Student_main {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		input(list);
		Student.rank(list);
		Student.sort(list);
		print(list);
	}

	static void input(ArrayList<Student> list) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("F:\\JAVA\\Java\\src\\ex18_7_student\\jumsu.txt"));
			while (true) {
				String str = reader.readLine();// 파일로부터 한 행씩 읽어요
				if (str == null)
					break;
				String[] sep = str.split(" ");
				list.add(new Student(sep[0],
						Integer.parseInt(sep[1]),
						Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			
		}
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
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.mathTotal + "\t");
		System.out.print(Student.engTotal + "\t");
	}
}
