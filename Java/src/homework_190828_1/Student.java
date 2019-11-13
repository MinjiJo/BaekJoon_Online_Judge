package homework_190828_1;

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
	
	static void rank(Student[] hs) {
		for (int i = 0; i < hs.length; i++)
			for (int j = 0; j < hs.length; j++)
				if (i != j && hs[i].getTotal() < hs[j].getTotal())
					hs[i].rank++;
	}
	
	static void sort(Student[] hs) {
		Student imsi;
		for (int i = 0; i < hs.length - 1; i++) {
			for (int j = i + 1; j < hs.length; j++) {
				if (hs[i].getTotal() < hs[j].getTotal()) {
					imsi = hs[i];
					hs[i] = hs[j];
					hs[j] = imsi;
				}
			}
		}
	}
}
