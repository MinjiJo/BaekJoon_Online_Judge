package ex15_1_ArrayList_static1_test;

import java.util.ArrayList;

public class Student_main {
	public static void main(String args[]) {
		Student h1 = new Student("��ȣ��", 85, 60, 70);
		Student h2 = new Student("�̽±�", 90, 95, 80);
		Student h3 = new Student("���缮", 75, 80, 100);
		Student h4 = new Student("����", 80, 70, 95);
		Student h5 = new Student("�̱���", 100, 65, 80);

		// ArrayList ���� �� �߰�
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
		System.out.print(Student.korTotal+"\t");
		System.out.print(Student.mathTotal+"\t");
		System.out.print(Student.engTotal+"\t");
	}
}
