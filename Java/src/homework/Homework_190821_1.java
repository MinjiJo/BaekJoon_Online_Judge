package homework;

public class Homework_190821_1 {
	public static void main(String[] args) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };
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

		int[] rank = {1,1,1,1,1};
		for(int i=0; i<student.length; i++) { 
			for(int j=0; j<student.length; j++) { 
				if(student[i] < student[j]) { 
					rank[i]++; 
					} 
				} 
			}

		System.out.println("========== 학생별   /  과목별 총점 및 평균 구하기  ==========");

		for (int i = 0; i < sub_name.length; i++)
			System.out.print("\t" + sub_name[i]);

		System.out.print("\t총점\t평균\t등수\n");

		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(student[i] + "\t" + student[i] / 3 + "\t" + rank[i] + "\n");
		}

		System.out.println("=============================================");

		System.out.print("총점\t");
		for (int i = 0; i < 3; i++)
			System.out.print(subject[i] + "\t");
	}

}
