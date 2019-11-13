package homework;

public class Homework_190822_Student {
	String name;
	int kor, eng, math;
	 
	Homework_190822_Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.print(name+"\t"+kor+"\t"+eng+"\t"+math);
	}
	
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	float getAverage() {
		float ave = (float)getTotal()/3;
		return ave;
	}	
}
