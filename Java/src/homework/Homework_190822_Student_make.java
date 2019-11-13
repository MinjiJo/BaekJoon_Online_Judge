package homework;

public class Homework_190822_Student_make {
	public static void main(String[] args) {
		String name[] = {"강호동", "이승기", "유재석", "하하","이광수"};
		   String sub_name[] = {"국어", "수학","영어"};
		   int [][]score = { 	{ 85,  60,  70},   
		        				{ 90,  95,  80},  
		        				{ 75,  80, 100},   
		                    	{ 80,  70,  95},   
		                    	{100,  65,  80}   
		    	};
		   int [] subject = new int[3]; //과목총점 저장 
		
		System.out.println("==========   학생별   /  과목별 총점구하기  ==========");
		
		// 제목
		System.out.print("이름\t");
		for(int i = 0; i < sub_name.length; i++) {
			System.out.print(sub_name[i]+"\t");
		}
		System.out.print("총점\t평균\n");
		
		
		// 본문
		Homework_190822_Student obj;
		
		for(int i = 0; i < score.length; i++) {
				obj = new Homework_190822_Student(name[i], score[i][0], score[i][1], score[i][2]);
				obj.getTotal();
				obj.getAverage();
				System.out.printf("\t%d\t%.1f\n", obj.getTotal(),obj.getAverage());
		}
		
		System.out.println("=============================================");
		
		System.out.print("총점\t");
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < score.length; j++) {
				subject[i] += score[j][i];
			}
			System.out.print(subject[i] + "\t");
		}
		
	}
}
