package homework_190827_1;

public class Student_make {
	public static void main(String[] args) {
		
		Student obj[] = new Student[5];
		obj[0] = new Student("강호동", 85, 60, 70);
		obj[1] = new Student("이승기", 90, 95, 80);
		obj[2] = new Student("유재석", 75, 80, 100);
		obj[3] = new Student("하하", 80, 70, 95);
		obj[4] = new Student("이광수", 100, 65, 80);
		
		for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < obj.length; j++) {
				if (obj[i].getTotal() < obj[j].getTotal()) {
					obj[i].rank ++;
				}
			}
		}
		
		System.out.print("===========     학생별   /   과목별   총점   구하기     ===========\n");
		System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t순위\n");

		for (int i = 0; i < obj.length; i++)
			printStudent(obj[i]);
		
		System.out.println("=======================================================");
		System.out.print("총점\t");
		System.out.println(Student.korTotal + "\t" + Student.mathTotal + "\t" + Student.engTotal + "\n");
		
		for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < obj.length; j++) {
				if (obj[i].rank < obj[j].rank) {
					Student imsi = obj[i];
					obj[i] = obj[j];
					obj[j] = imsi;
				}
			}
		}
		
		System.out.print("===========     학생별   /   과목별   총점   구하기     ===========\n");
		System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t순위\n");

		for (int i = 0; i < obj.length; i++)
			printStudent(obj[i]);
		
		System.out.println("=======================================================");
		System.out.print("총점\t");
		System.out.println(Student.korTotal + "\t" + Student.mathTotal + "\t" + Student.engTotal);
	}
	
	static void printStudent(Student obj) {
		System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.math+"\t"
	                    +obj.eng+"\t"+obj.getTotal()+"\t");
		System.out.printf("%.1f\t%d\n",obj.getAverage(),obj.rank );
	}
}
