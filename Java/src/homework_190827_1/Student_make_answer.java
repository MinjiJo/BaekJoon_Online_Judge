package homework_190827_1;

public class Student_make_answer {
	public static void main(String[] args) {
		Student h1 = new Student("��ȣ��", 85, 60, 70);
		Student h2 = new Student("�̽±�", 90, 95, 80);
		Student h3 = new Student("���缮", 75, 80, 100);
		Student h4 = new Student("����", 80, 70, 95);
		Student h5 = new Student("�̱���", 100, 65, 80);
		Student hs[] = { h1, h2, h3, h4, h5 };
		rank(hs);
		print(hs);
		sort(hs);
		print(hs);
	}

	static void rank(Student[] hs) {
		// ��� ���ϱ�
		for (int i = 0; i < hs.length; i++)
			for (int j = 0; j < hs.length; j++)
				if (i != j && hs[i].getTotal() < hs[j].getTotal())
					hs[i].rank++;
	}

	static void sort(Student[] hs) {
		// �л��� ������ �������� �����ϱ�
		Student imsi;
		for (int i = 0; i < hs.length - 1; i++) {
			for (int j = i + 1; j < hs.length; j++) {
				if (hs[i].getTotal() < hs[j].getTotal()) {
					imsi = hs[i];
					hs[i] = hs[j];
					hs[j] = imsi;
				}
			} // for j
		} // for i
	}// sort end

	static void print(Student[] hs) {
		// ����ϱ�
		System.out.println("===============   �л���   /  ���� �������ϱ�  ==========");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for (int i = 0; i < hs.length; i++) {
			System.out.print(hs[i].name + "\t");
			System.out.print(hs[i].kor + "\t");
			System.out.print(hs[i].eng + "\t");
			System.out.print(hs[i].math + "\t");
			System.out.print(hs[i].getTotal() + "\t");
			System.out.printf("%.1f\t%d\n", hs[i].getAverage(), hs[i].rank);
		}

		for (int j = 0; j < 51; j++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		System.out.print(Student.korTotal + "\t");
		System.out.print(Student.engTotal + "\t");
		System.out.print(Student.mathTotal + "\n\n");
	}
}
