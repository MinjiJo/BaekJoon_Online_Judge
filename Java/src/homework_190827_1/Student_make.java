package homework_190827_1;

public class Student_make {
	public static void main(String[] args) {
		
		Student obj[] = new Student[5];
		obj[0] = new Student("��ȣ��", 85, 60, 70);
		obj[1] = new Student("�̽±�", 90, 95, 80);
		obj[2] = new Student("���缮", 75, 80, 100);
		obj[3] = new Student("����", 80, 70, 95);
		obj[4] = new Student("�̱���", 100, 65, 80);
		
		for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < obj.length; j++) {
				if (obj[i].getTotal() < obj[j].getTotal()) {
					obj[i].rank ++;
				}
			}
		}
		
		System.out.print("===========     �л���   /   ����   ����   ���ϱ�     ===========\n");
		System.out.print("�̸�\t����\t����\t����\t����\t���\t����\n");

		for (int i = 0; i < obj.length; i++)
			printStudent(obj[i]);
		
		System.out.println("=======================================================");
		System.out.print("����\t");
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
		
		System.out.print("===========     �л���   /   ����   ����   ���ϱ�     ===========\n");
		System.out.print("�̸�\t����\t����\t����\t����\t���\t����\n");

		for (int i = 0; i < obj.length; i++)
			printStudent(obj[i]);
		
		System.out.println("=======================================================");
		System.out.print("����\t");
		System.out.println(Student.korTotal + "\t" + Student.mathTotal + "\t" + Student.engTotal);
	}
	
	static void printStudent(Student obj) {
		System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.math+"\t"
	                    +obj.eng+"\t"+obj.getTotal()+"\t");
		System.out.printf("%.1f\t%d\n",obj.getAverage(),obj.rank );
	}
}
