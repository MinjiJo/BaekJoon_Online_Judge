package homework;

public class Homework_190823_Student_make {
	public static void main(String[] args) {
		Homework_190823_Student obj1=new Homework_190823_Student("강호동", 85, 60, 70);
		Homework_190823_Student obj2=new Homework_190823_Student("이승기", 90, 95, 80);
		Homework_190823_Student obj3=new Homework_190823_Student("유재석", 75, 80, 100);
		Homework_190823_Student obj4=new Homework_190823_Student("하하", 80, 70, 95);
		Homework_190823_Student obj5=new Homework_190823_Student("이광수", 100, 65, 80);

		System.out.print("==========   학생별  / 과목별 총점 평균 구하기  ==========\n\t");
		System.out.print("국어\t영어\t수학\t총점\t평균\n");
		printStudent(obj1);
		printStudent(obj2);
		printStudent(obj3);
		printStudent(obj4);
		printStudent(obj5);
		System.out.println("==============================================");
		System.out.print("총점\t");
		System.out.println(Homework_190823_Student.korTotal+"\t"
		                  +Homework_190823_Student.mathTotal+"\t"
				          +Homework_190823_Student.engTotal);	
	}
		static void printStudent(Homework_190823_Student obj) {
			System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.math+"\t"
		                    +obj.eng+"\t"+obj.getTotal()+"\t");
			System.out.printf("%.1f\n",obj.getAverage() );
	}
}
