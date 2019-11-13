package ex18_7_student;

import java.util.ArrayList;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	static int korTotal;
	static int engTotal;
	static int mathTotal;
	int rank=1;
	
	Student(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		korTotal += kor;
		mathTotal += math;
		engTotal += eng;
	}
	
	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (getTotal() / 3f);
	}
	
	static void rank(ArrayList<Student> as) {
		for (int i = 0; i < as.size(); i++) {
			Student s = as.get(i);
			for(int j = 0; j < as.size(); j++) {
				if (s.getTotal() < as.get(j).getTotal())
					s.rank++;
			}
		}
	}
	
	static void sort(ArrayList<Student> as) {
		// 학생별 총점을 기준으로 정렬하기
		Student imsi;
		for (int i = 0; i < as.size() - 1; i++) {
			for (int j = i + 1; j < as.size(); j++) {
				if (as.get(i).getTotal() < as.get(j).getTotal()) {
					imsi = as.get(i);
					as.set(i, as.get(j));
					as.set(j, imsi);					
				}
			}
		}
	}
	
	public String toString() {
		return name + "\t" + kor + "\t" + math + "\t"
				+ eng + "\t" + getTotal() + "\t"
				+ String.format("%.1f", getAverage()) + "\t"
				+ rank + "\n";
	}
}
