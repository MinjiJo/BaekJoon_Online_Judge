package homework;

public class Homework_190819_5_answer {
	public static void main(String[] args) {
		int factorial = 1;
		for(int i = 1; i <= 5; i++) {
			factorial *= i;
			System.out.println(i + "! = " + factorial);
		}
	}
}
