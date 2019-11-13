package homework_190827_1;

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
	
}
