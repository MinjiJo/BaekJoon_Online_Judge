package homework;

public class Homework_190826_Student_make {
	public static void main(String[] args) {

		Homework_190826_Student obj1 = new Homework_190826_Student("��ȣ��", 85, 60, 70);
		Homework_190826_Student obj2 = new Homework_190826_Student("�̽±�", 90, 95, 80);
		Homework_190826_Student obj3 = new Homework_190826_Student("���缮", 75, 80, 100);
		Homework_190826_Student obj4 = new Homework_190826_Student("����", 80, 70, 95);
		Homework_190826_Student obj5 = new Homework_190826_Student("�̱���", 100, 65, 80);

		int getTotalSum[] = { obj1.getTotal(), obj2.getTotal(), obj3.getTotal(), obj4.getTotal(), obj5.getTotal() };
		int getRank[] = {obj1.rank, obj2.rank, obj3.rank, obj4.rank, obj5.rank};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (getTotalSum[i] < getTotalSum[j]) {
					getRank[i] ++;
				}
			}
		}
		
		obj1.rank = getRank[0];
		obj2.rank = getRank[1];
		obj3.rank = getRank[2];
		obj4.rank = getRank[3];
		obj5.rank = getRank[4];

		System.out.print("===========     �л���   /   ����   ����   ���ϱ�     ===========\n\t");
		System.out.print("����\t����\t����\t����\t���\t���\n");

		printStudent(obj1);
		printStudent(obj2);
		printStudent(obj3);
		printStudent(obj4);
		printStudent(obj5);
		
		System.out.println("====================================================");
		System.out.print("����\t");
		System.out.println(Homework_190826_Student.korTotal + "\t" + Homework_190826_Student.mathTotal + "\t" + Homework_190826_Student.engTotal);
	}
	
	static void printStudent(Homework_190826_Student obj) {
		System.out.print(obj.name+"\t"+obj.kor+"\t"+obj.math+"\t"
	                    +obj.eng+"\t"+obj.getTotal()+"\t");
		System.out.printf("%.1f\t%d\n",obj.getAverage(),obj.rank );
	}
}
