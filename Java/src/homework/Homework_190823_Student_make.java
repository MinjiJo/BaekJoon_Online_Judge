package homework;

public class Homework_190823_Student_make {
	public static void main(String[] args) {
		Homework_190823_Student obj1=new Homework_190823_Student("��ȣ��", 85, 60, 70);
		Homework_190823_Student obj2=new Homework_190823_Student("�̽±�", 90, 95, 80);
		Homework_190823_Student obj3=new Homework_190823_Student("���缮", 75, 80, 100);
		Homework_190823_Student obj4=new Homework_190823_Student("����", 80, 70, 95);
		Homework_190823_Student obj5=new Homework_190823_Student("�̱���", 100, 65, 80);

		System.out.print("==========   �л���  / ���� ���� ��� ���ϱ�  ==========\n\t");
		System.out.print("����\t����\t����\t����\t���\n");
		printStudent(obj1);
		printStudent(obj2);
		printStudent(obj3);
		printStudent(obj4);
		printStudent(obj5);
		System.out.println("==============================================");
		System.out.print("����\t");
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
