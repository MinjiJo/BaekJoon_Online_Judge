package homework;

public class Homework_190821_2 {
	public static void main(String[] args) {
		String name[] = { "��ȣ��", "�̽±�", "���缮", "����", "�̱���" };
		String sub_name[] = { "����", "����", "����" };
		int[][] score = { { 85, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		int[] subject = new int[3];
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < score.length; j++) {
				subject[i] += score[j][i];
			}
		}

		int[] student = new int[5];
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				student[i] += score[i][j];
			}
		}

		int[] rank = { 1, 1, 1, 1, 1 };
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student.length; j++) {
				if (student[i] < student[j]) {
					rank[i]++;
				}
			}
		}

		System.out.println("========== �л���   /  ���� ���� �� ��� ���ϱ�  ==========");

		for (int i = 0; i < sub_name.length; i++)
			System.out.print("\t" + sub_name[i]);

		System.out.print("\t����\t���\t���\n");

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student.length; j++) {
				if (i != j && rank[i] < rank[j]) {
					String imsi = name[i];
					name[i] = name[j];
					name[j] = imsi;

					int[] imsi2 = score[i];
					score[i] = score[j];
					score[j] = imsi2;

					int imsi3 = student[i];
					student[i] = student[j];
					student[j] = imsi3;

					int imsi4 = rank[i];
					rank[i] = rank[j];
					rank[j] = imsi4;
				} 
				
			} 
		} 

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int k = 0; k < score[i].length; k++) {
				System.out.print(score[i][k] + "\t");
			}
			System.out.print(student[i] + "\t" + student[i] / 3 + "\t" + rank[i] + "\n");
		}
		
		System.out.println("=============================================");

		System.out.print("����\t");
		for (int k = 0; k < 3; k++)
			System.out.print(subject[k] + "\t");

	}
}