package ex5_2_switch;

public class SwtichExample1 {
	public static void main(String[] args) {
		int num = 2;
		switch (num) {
		case 1:
			System.out.println("Good Morning, Java");
			//break;
		case 2:
			System.out.println("Good Afternoon, Java");
			//break;
		case 3:
			System.out.println("Good Evening, Java");
			//break;
		default:
			System.out.println("Hello, Java");
		}
		System.out.println("Done.");
	}
}
