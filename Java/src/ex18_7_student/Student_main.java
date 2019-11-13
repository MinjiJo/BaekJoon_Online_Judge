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
				String str = reader.readLine();// ���Ϸκ��� �� �྿ �о��
				if (str == null)
					break;
				String[] sep = str.split(" ");
				list.add(new Student(sep[0],
						Integer.parseInt(sep[1]),
						Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			
		}
	}

	// ����ϱ�
	static void print(ArrayList<Student> as) {
		System.out.println("===========    �л���   /   ����   ����   ���ϱ�    ===========");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
		for (int i = 0; i < as.size(); i++) {
			System.out.print(as.get(i).toString());
		}
		for (int j = 0; j < 51; j++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.mathTotal + "\t");
		System.out.print(Student.engTotal + "\t");
	}
}
